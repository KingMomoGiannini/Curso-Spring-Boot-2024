package com.example.aplicacion.service;

import com.example.aplicacion.model.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService{

    //Metodos de logica de negocio

    @Override
    public void crearPersona(Persona persona) {
        //logica de creacion de la persona

    }

    @Override
    public List<Persona> traerPersonas() {
        //aca debería haber una logica para devolver la lista de personas
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
