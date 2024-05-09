/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicios.hellobye.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Seba
 */
@RestController
public class HelloByeController {
    
    @GetMapping ("/hello/{nombre}")
    public String sayHello(@PathVariable String nombre){
        return "Hola Mundo " + nombre;
    }
    
    @GetMapping ("hello/{nombre}/{edad}/{profesion}")
    public String sayHelloCompleto(@PathVariable String nombre,
                                   @PathVariable int edad,
                                   @PathVariable String profesion){
        return "Hola mundo"
                + "Tu nombre es: " + nombre + 
                "Tu edad es: " + edad + 
                "Profesion: " + profesion;
    }
    
    @GetMapping("/bye/{nombre}")
    public String sayBye(@PathVariable String nombre){
        return "Adios Mundo " + nombre ;
    }
}
