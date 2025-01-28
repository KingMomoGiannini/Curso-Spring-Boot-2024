package com.curso.proyectofinal.controller;

import com.curso.proyectofinal.model.Producto;
import com.curso.proyectofinal.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private IProductoService productoService;

    @PostMapping("/crear")
    public void crearProducto(@RequestBody Producto producto) {
        productoService.saveProducto(producto);
    }

    @GetMapping("/traerTodos")
    public List<Producto> listarProductos() {
        return productoService.traerProductos();
    }

    @GetMapping("/{codigo_producto}")
    public Producto obtenerProducto(@PathVariable Long codigo_producto) {
        return productoService.traerProducto(codigo_producto);
    }

    @DeleteMapping("/eliminar/{codigo_producto}")
    public void eliminarProducto(@PathVariable Long codigo_producto) {
        productoService.eliminarProducto(codigo_producto);
    }

    @PutMapping("/editar/{codigo_producto}")
    public Producto editarProducto(@PathVariable Long codigo_producto,
                                   @RequestParam String nombre,
                                   @RequestParam String marca,
                                   @RequestParam double costo,
                                   @RequestParam double cantidad_disponible) {
        return productoService.editarProducto(codigo_producto, nombre, marca, costo, cantidad_disponible);
    }
}
