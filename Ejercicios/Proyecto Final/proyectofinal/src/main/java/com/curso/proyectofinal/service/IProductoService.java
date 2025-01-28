package com.curso.proyectofinal.service;

import com.curso.proyectofinal.model.Producto;

import java.util.List;

public interface IProductoService {


    public void saveProducto(Producto producto);

    public List<Producto> traerProductos();

    public Producto traerProducto(Long id);

    public void eliminarProducto(Long id);

    public Producto editarProducto(Long idProducto, String nombre, String marca, double precio, double cantidad_disponible);

}

