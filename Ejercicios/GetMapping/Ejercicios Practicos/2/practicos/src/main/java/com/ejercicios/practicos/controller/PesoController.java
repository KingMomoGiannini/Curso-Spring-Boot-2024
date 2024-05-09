/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicios.practicos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *Una nutricionista desea la realización de una API que a partir del 
 * ingreso del IMC (índice de masa corporal) de una persona en el parámetro 
 * de la url, le devuelva el estado de su peso. 
 * Para ello tener en cuenta los siguientes rangos:
            de 1 a 18.5: Peso insuficiente
            de 18.6 a 24.9: Peso normal
            de 25.0 a 29.9: Sobrepeso
            de 30 en adelante: Obesidad
Tener en cuenta para la realización de este ejercicio la annotation @RequestParam
 * @author Seba
 */
@RestController
public class PesoController {
    
    @GetMapping("/imc")
    public String estadoPeso(@RequestParam double imc){
        String peso = null;
        if (imc >= 1 && imc <= 18.5) {
            peso = "IMC: "+imc+" --- Peso Insuficiente";
        }
        else if (imc >= 18.6 && imc <= 24.9) {
            peso = "IMC: "+imc+" --- Peso Normal";
        }
        else if (imc >= 25 && imc <= 29.9) {
            peso = "IMC: "+imc+" --- Sobrepeso";
        }
        else if (imc >= 30) {
            peso = "IMC: "+imc+" --- Obesidad";
        }
        return peso;
    }
}
