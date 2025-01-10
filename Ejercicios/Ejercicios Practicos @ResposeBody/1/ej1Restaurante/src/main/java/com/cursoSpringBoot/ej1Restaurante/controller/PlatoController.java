package com.cursoSpringBoot.ej1Restaurante.controller;

import com.cursoSpringBoot.ej1Restaurante.Plato;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PlatoController {

    @GetMapping("/plato/{numeroPlato}")
    @ResponseBody
    public Plato obtenerElPlato(@PathVariable int numeroPlato){
        List<Plato> menu = new ArrayList<>();
        Plato elPlato = null;
        cargaMenu(menu);
        for(Plato plato : menu){
            if(plato.getNumero() == numeroPlato){
                elPlato = plato;
            }
        }
        return elPlato;
    }

    @GetMapping("/menu")
    @ResponseBody
    public List<Plato> obtenerMenu(){
        List<Plato> menu = new ArrayList<>();
        cargaMenu(menu);
        return menu;
    }

    private void cargaMenu(List<Plato> menu){
        menu.add(new Plato("Plato1", 1, 10.0, "Descripcion1"));
        menu.add(new Plato("Plato2", 2, 20.0, "Descripcion2"));
        menu.add(new Plato("Plato3", 3, 30.0, "Descripcion3"));
        menu.add(new Plato("Plato4", 4, 40.0, "Descripcion4"));
    }

}
