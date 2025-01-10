package com.cursoSpringBoot.ej2odontologo.controllers;

import com.cursoSpringBoot.ej2odontologo.Paciente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PacienteController {

    @GetMapping("/listaPacientes")
    @ResponseBody
    public List<Paciente> traerPacientes() {
        List<Paciente> listaPacientes = new ArrayList<>();
        cargarLista(listaPacientes);
        return listaPacientes;
    }

    @GetMapping("/listaPacientesMenores")
    @ResponseBody
    public List<Paciente> traerPacientesMenores() {
        List<Paciente> listaPacientes = new ArrayList<>();
        cargarLista(listaPacientes);
        List<Paciente> listaPacientesMenores = new ArrayList<>();
        LocalDate fechaActual = LocalDate.now();
        for (Paciente paciente : listaPacientes) {
            if (esMenor(paciente)) {
                listaPacientesMenores.add(paciente);
                System.out.println(Period.between(paciente.getFechaNacimiento(),fechaActual).getYears());
            }
        }
        return listaPacientesMenores;
    }

    private boolean esMenor(Paciente paciente) {
        LocalDate fechaActual = LocalDate.now();
        boolean menor = false;
        if (Period.between(paciente.getFechaNacimiento(),fechaActual).getYears() < 18) {
            menor = true;
        }
        return menor;
    }



    private void cargarLista(List<Paciente> pacientes){
        Paciente paciente1 = new Paciente(1, 12345678, "Juan", "Perez", convertirFecha("1990-01-01"));
        Paciente paciente2 = new Paciente(2, 23456789, "Maria", "Gomez", convertirFecha("2005-01-01"));
        Paciente paciente3 = new Paciente(3, 34567890, "Pedro", "Gonzalez", convertirFecha("2010-01-01"));
        Paciente paciente4 = new Paciente(4, 45678901, "Jose", "Rodriguez", convertirFecha("1995-01-01"));
        Paciente paciente5 = new Paciente(5, 56789012, "Ana", "Lopez", convertirFecha("2000-01-01"));

        pacientes.add(paciente1);
        pacientes.add(paciente2);
        pacientes.add(paciente3);
        pacientes.add(paciente4);
        pacientes.add(paciente5);

    }
    private LocalDate convertirFecha(String fecha){
        String[] fechaArray = fecha.split("-");
        return LocalDate.of(Integer.parseInt(fechaArray[0]), Integer.parseInt(fechaArray[1]), Integer.parseInt(fechaArray[2]));
    }
}
