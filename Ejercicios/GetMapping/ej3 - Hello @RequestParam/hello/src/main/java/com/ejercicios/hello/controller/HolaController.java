/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicios.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Seba
 */
@RestController
public class HolaController {
    
    @GetMapping("/hola")
    public String decirHola(@RequestParam String nombre,
                            @RequestParam int edad,
                            @RequestParam String profesion){
        return "Hola! tu nombre es: "+ nombre+
                " edad: " + edad + 
                " profesion: " + profesion;
    }
    
}
