package com.curso.proyectofinal.service;

import com.curso.proyectofinal.model.Producto;
import com.curso.proyectofinal.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements IProductoService {

    @Autowired
    private IProductoRepository productoRepository;

    @Override
    public void saveProducto(Producto producto) {
        Producto elProducto;
        elProducto = producto;
        productoRepository.save(elProducto);
    }

    @Override
    public List<Producto> traerProductos() {
        List<Producto> productos;
        productos = productoRepository.findAll();
        return productos;
    }

    @Override
    public Producto traerProducto(Long id) {
        Producto producto;
        producto = productoRepository.findById(id).orElse(null);
        return producto;
    }

    @Override
    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }

    @Override
    public Producto editarProducto(Long idProducto, String nombre, String marca, double precio, double cantidad_disponible) {
        Producto producto;
        producto = productoRepository.findById(idProducto).orElse(null);
        if (producto != null) {
            producto.setNombre(nombre);
            producto.setMarca(marca);
            producto.setCosto(precio);
            producto.setCantidad_disponible(cantidad_disponible);
            productoRepository.save(producto);
        }
        return producto;
    }
}
