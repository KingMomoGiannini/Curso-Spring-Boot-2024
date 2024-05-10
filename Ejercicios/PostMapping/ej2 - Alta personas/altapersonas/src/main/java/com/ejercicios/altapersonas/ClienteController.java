/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejercicios.altapersonas;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Seba
 */
@RestController
public class ClienteController {
    
    @GetMapping("/cliente/traer")
    @ResponseBody
    public List<Cliente> traerClientes(){
        
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        listaClientes.add(new Cliente (1L,"Sebastian","Giannini"));
        listaClientes.add(new Cliente (2L,"Sarah","Badia"));
        listaClientes.add(new Cliente (3L,"Roberto","Arlt"));
        
        return listaClientes;
        
    }
    
    @GetMapping("/pruebaresponse")
    ResponseEntity<String> traerRespuesta(){
        
        return new ResponseEntity<>("Esta es una prueba de response", HttpStatus.NOT_FOUND);
    }
     
}
