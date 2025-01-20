package com.example.ej1PromNotas.repository;

import org.springframework.stereotype.Repository;

@Repository
public class AlumnoRepository implements IAlumnoRepository {

    @Override
    public double devolverPromedio(double nota1, double nota2, double nota3) {
        return ((nota1 + nota2 + nota3) / 3);
    }
}
