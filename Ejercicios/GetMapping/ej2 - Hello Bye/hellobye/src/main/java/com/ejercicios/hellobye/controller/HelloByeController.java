/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicios.hellobye.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Seba
 */
@RestController
public class HelloByeController {
    
    @GetMapping ("/hello")
    public String sayHello(){
        return "Hola Mundo";
    }
    
    @GetMapping("/bye")
    public String sayBye(){
        return "Adios Mundo";
    }
}
