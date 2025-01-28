package com.curso.proyectofinal.controller;

import com.curso.proyectofinal.model.Venta;
import com.curso.proyectofinal.service.IVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/venta")
public class VentaController {
    @Autowired
    private IVentaService ventaService;

    @PostMapping("/crear")
    public void crearVenta(@RequestBody Venta venta) {
        ventaService.saveVenta(venta);
    }

    @GetMapping("/traerTodos")
    public List<Venta> listarVentas() {
        return ventaService.traerVentas();
    }

    @GetMapping("/{codigo_venta}")
    public Venta obtenerVenta(@PathVariable Long codigo_venta) {
        return ventaService.traerVenta(codigo_venta);
    }

    @DeleteMapping("/eliminar/{codigo_venta}")
    public void eliminarVenta(@PathVariable Long codigo_venta) {
        ventaService.eliminarVenta(codigo_venta);
    }

    @PutMapping("/editar/{codigo_venta}")
    public Venta editarVenta(@PathVariable Long codigo_venta, LocalDate fecha, double total) {
        return ventaService.editarVenta(codigo_venta, fecha, total);
    }
}
