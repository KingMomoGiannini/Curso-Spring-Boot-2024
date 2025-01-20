package com.example.ej1PromNotas.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Alumno {

    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;

    public Alumno(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.promedio = (nota1 + nota2 + nota3) / 3;
    }

    public Alumno(){
    }

}
