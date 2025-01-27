package com.curso.ej2clinicaVeterinaria.controller;

import com.curso.ej2clinicaVeterinaria.model.Mascota;
import com.curso.ej2clinicaVeterinaria.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MascotaController {

    @Autowired
    private IMascotaService mascotaService;

    @GetMapping("/mascota/traerMascotas")
    public List<Mascota> traerMascotas(){
        List<Mascota> mascotas = mascotaService.getMascotas();
        return mascotas;
    }

    @PostMapping("/mascota/crear")
    public String crearMascota(@RequestBody Mascota mascota) {
        mascotaService.saveMascota(mascota);
        return "Mascota creada";
    }

    @DeleteMapping("/mascota/borrar/{id}")
    public String borrarMascota(@PathVariable Long id) {
        mascotaService.deleteMascota(id);
        return "Mascota borrada";
    }

    @PutMapping("/mascota/editar/{id}")
    public Mascota editMascota(@PathVariable Long id,
                               @RequestParam(required = false) String nombre,
                               @RequestParam(required = false) String raza,
                               @RequestParam(required = false) String color,
                               @RequestParam(required = false) String especie) {
        mascotaService.editMascota(id, nombre, raza, color, especie);

        Mascota laMascotaEditada = mascotaService.findMascota(id);
        return laMascotaEditada;
    }

}
