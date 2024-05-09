/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicios.pruebapost;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Seba
 */
@RestController
public class ClienteController {
    
    @PostMapping ("/cliente")
    public void crearCliente(@RequestBody Cliente cli){
        
        System.out.println("Cliente Creado");
        System.out.println("Nombre: " + cli.getNombre());
        System.out.println("Apellido: " + cli.getApellido());
    }
    
}
