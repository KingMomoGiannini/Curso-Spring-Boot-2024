package com.example.ej2estBasquet.controller;

import com.example.ej2estBasquet.model.Jugador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JugadorController {

    @PostMapping("/promedioJugadores")
    public double promedioJugadores(@RequestBody List<Jugador> jugadores) {
        double sumaEstaturas = 0;
        List<Jugador> listaJugadores = new ArrayList<>();
        listaJugadores = jugadores;
        for (Jugador jugador : listaJugadores) {
            sumaEstaturas += jugador.getEstatura();
        }
        return sumaEstaturas / jugadores.size();
    }

}
