package com.curso.pruebaJPA.service;

import com.curso.pruebaJPA.model.Persona;
import com.curso.pruebaJPA.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private IPersonaRepository personaRepo;

    @Override
    public List<Persona> getPersonas() {
        List<Persona> listaPersonas = personaRepo.findAll();
        return listaPersonas;
    }

    @Override
    public void savePersona(Persona persona) {
        personaRepo.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        personaRepo.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona perso = personaRepo.findById(id).orElse(null);
        return perso;
    }

    @Override
    public void editPersona(Long idOriginal, Long idNueva, String nuevoNombre, String nuevoApellido, int nuevaEdad) {
        //1er paso, busco la persona original
        Persona perso = this.findPersona(idOriginal);
        if (perso != null) {
            perso.setId(idNueva);
            perso.setNombre(nuevoNombre);
            perso.setApellido(nuevoApellido);
            perso.setEdad(nuevaEdad);
            //guardo los cambios
            this.savePersona(perso);
        }
    }


}
