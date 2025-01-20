package com.example.ej1PromNotas.controller;

import com.example.ej1PromNotas.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumnoController {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @GetMapping("/promedio")
    public double promedio(@RequestParam double nota1, @RequestParam double nota2, @RequestParam double nota3) {
        return alumnoRepository.devolverPromedio(nota1, nota2, nota3);
    }

}
