package com.curso.proyectofinal.controller;

import com.curso.proyectofinal.model.Cliente;
import com.curso.proyectofinal.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private IClienteService clienteService;

    @PostMapping("/crear")
    public String crearCliente(@RequestBody Cliente cliente) {
        clienteService.saveCliente(cliente);
        return "Cliente creado";
    }

    @GetMapping("/traerTodos")
    public List<Cliente> listarClientes() {
        return clienteService.traerClientes();
    }

    @GetMapping("/{id_cliente}")
    public Cliente obtenerCliente(@PathVariable Long id_cliente) {
        return clienteService.traerCliente(id_cliente);
    }

    @DeleteMapping("/eliminar/{id_cliente}")
    public void eliminarCliente(@PathVariable Long id_cliente) {
        clienteService.eliminarCliente(id_cliente);
    }

    @PutMapping("/editar/{id_cliente}")
    public Cliente editarCliente(@PathVariable Long id_cliente,
                                 @RequestParam String nombre,
                                 @RequestParam String apellido,
                                 @RequestParam String dni) {
        return clienteService.editarCliente(id_cliente, nombre, apellido, dni);
    }

}
