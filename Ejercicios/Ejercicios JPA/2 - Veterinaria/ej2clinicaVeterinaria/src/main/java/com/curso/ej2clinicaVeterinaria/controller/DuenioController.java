package com.curso.ej2clinicaVeterinaria.controller;

import com.curso.ej2clinicaVeterinaria.model.Duenio;
import com.curso.ej2clinicaVeterinaria.service.IDuenioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DuenioController {

    @Autowired
    private IDuenioService duenioService;

    @GetMapping("/duenio/traerDuenios")
    public List<Duenio> traerDuenios(){
        return duenioService.getDuenios();
    }

    @PostMapping("/duenio/crear")
    public String crearDuenio(@RequestBody Duenio duenio) {
        duenioService.saveDuenio(duenio);
        return "Duenio creado";
    }

    @DeleteMapping("/duenio/borrar/{id}")
    public String borrarDuenio(@PathVariable Long id) {
        duenioService.deleteDuenio(id);
        return "Duenio borrado";
    }

    @PutMapping("/duenio/editar/{id}")
    public Duenio editDuenio(@PathVariable Long id,
                               @RequestParam String nombre,
                               @RequestParam String apellido,
                               @RequestParam String celular,
                               @RequestParam String dni) {
        duenioService.editDuenio(id, nombre, apellido, celular, dni);

        Duenio elDuenioEditado = duenioService.findDuenio(id);
        return elDuenioEditado;
    }

}

