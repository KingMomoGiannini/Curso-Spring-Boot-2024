package com.curso.proyectofinal.service;

import com.curso.proyectofinal.model.Cliente;
import com.curso.proyectofinal.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    private IClienteRepository clienteRepository;

    @Override
    public void saveCliente(Cliente cliente) {
        Cliente elCliente;
        elCliente = cliente;
        clienteRepository.save(elCliente);
    }

    @Override
    public List<Cliente> traerClientes() {
        List<Cliente> clientes;
        clientes = clienteRepository.findAll();
        return clientes;
    }

    @Override
    public Cliente traerCliente(Long id) {
        Cliente cliente;
        cliente = clienteRepository.findById(id).orElse(null);
        return cliente;
    }

    @Override
    public void eliminarCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public Cliente editarCliente(Long idCliente, String nombre, String apellido, String dni) {
        Cliente cliente;
        cliente = clienteRepository.findById(idCliente).orElse(null);
        if (cliente != null) {
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setDni(dni);
            clienteRepository.save(cliente);
        }
        return cliente;
    }
}
