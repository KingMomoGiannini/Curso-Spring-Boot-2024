package com.example.ej3areaTriangulo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrianguloController {

    @GetMapping("/area")
    public String area(@RequestParam double base, @RequestParam double altura) {
        return "El area del triangulo es: " + (base * altura) / 2;
    }
}
