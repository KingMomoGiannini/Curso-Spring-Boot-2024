package com.curso.proyectofinal.service;

import com.curso.proyectofinal.model.Venta;

import java.time.LocalDate;
import java.util.List;

public interface IVentaService {

    public void saveVenta(Venta venta);

    public List<Venta> traerVentas();

    public Venta traerVenta(Long id);

    public void eliminarVenta(Long id);

    public Venta editarVenta(Long idVenta, LocalDate fecha, double total);
}
