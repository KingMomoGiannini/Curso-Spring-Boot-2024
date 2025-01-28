package com.curso.proyectofinal.service;

import com.curso.proyectofinal.model.Cliente;

import java.util.List;

public interface IClienteService {

    public void saveCliente(Cliente cliente);

    public List<Cliente> traerClientes();

    public Cliente traerCliente(Long id);

    public void eliminarCliente(Long id);

    public Cliente editarCliente(Long idCliente, String nombre, String apellido, String dni);

}
