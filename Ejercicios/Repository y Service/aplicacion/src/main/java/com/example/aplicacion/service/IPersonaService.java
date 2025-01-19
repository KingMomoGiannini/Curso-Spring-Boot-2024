package com.example.aplicacion.service;

import com.example.aplicacion.model.Persona;

import java.util.List;

public interface IPersonaService {

    public void crearPersona(Persona persona);
    public List<Persona> traerPersonas();

}
