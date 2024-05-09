/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicios.primerintegrador.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Seba
 */

@RestController
public class CombustibleController {
    
    @GetMapping("/litros")
    public String litrosAGalones(@RequestParam double galones){
        double litros = galones*3.78541;
        String respuesta = null;
        if (galones>0) {
            respuesta = galones + " Galones equivalen a " + litros + " Litros";
        }
        else{
            respuesta = "La cantidad a convertir debe ser superior a 0 (cero)";
        }
        return respuesta;
    }
    
}
