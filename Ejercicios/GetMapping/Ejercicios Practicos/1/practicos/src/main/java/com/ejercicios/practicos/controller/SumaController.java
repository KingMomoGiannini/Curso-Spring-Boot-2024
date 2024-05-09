/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicios.practicos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *Un profesor de matemáticas de primaria desea la realización de una API 
 * mediante la cual a partir de la recepción de dos números como parámetros 
 * de una URL, la misma devuelva la suma de ambos números por pantalla. 
 * Utilizar para este ejercicio la annotation @PathVariable
 * @author Seba
 */
@RestController
public class SumaController {
    
    @GetMapping ("suma/{numUno}/{numDos}")
    public String suma(@PathVariable int numUno,
                       @PathVariable int numDos){
        int suma = numUno+numDos;
        return "numeros: "+numUno+" y "+numDos+
                "     La suma de ambos numeros es: "+ suma;
    }
    
}
