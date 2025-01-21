package com.curso.pruebaJPA.controller;

import com.curso.pruebaJPA.model.Persona;
import com.curso.pruebaJPA.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    private IPersonaService persoServ;

    @GetMapping("/personas/traer")
    public List<Persona> traerPersonas(){
        return persoServ.getPersonas();
    }

    @PostMapping("/personas/crear")
    public String savePersona(@RequestBody Persona persona){
        persoServ.savePersona(persona);
        return "Persona creada correctamente.";
    }

    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        persoServ.deletePersona(id);
        return "Persona eliminada correctamente.";
    }

    @PutMapping("/personas/editar/{id_original}")
    public Persona editPersona(@PathVariable Long id_original,
                               @RequestParam (required = false, name = "id") Long nuevaId,
                               @RequestParam (required = false, name = "nombre") String nuevoNombre,
                               @RequestParam (required = false, name = "apellido") String nuevoApellido,
                               @RequestParam (required = false, name = "edad") int nuevaEdad){
        persoServ.editPersona(id_original, nuevaId, nuevoNombre, nuevoApellido, nuevaEdad);
        Persona perso = persoServ.findPersona(nuevaId);

        return perso;
    }
}
