package com.curso.pruebaJPA.service;

import com.curso.pruebaJPA.model.Persona;

import java.util.List;

public interface IPersonaService {

    //metodo para traer a todas las personas
    public List<Persona> getPersonas();

    //metodo para guardar persona
    public void savePersona(Persona persona);

    //baja
    public void deletePersona(Long id);

    //lectura
    public Persona findPersona(Long id);

    //modificacion
    public void editPersona(Long id, Long idNueva,
                            String nuevoNombre,
                            String nuevoApellido,
                            int nuevaEdad);
}
