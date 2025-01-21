package com.example.ej3areaTriangulo.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Triangulo {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo() {
    }
}
