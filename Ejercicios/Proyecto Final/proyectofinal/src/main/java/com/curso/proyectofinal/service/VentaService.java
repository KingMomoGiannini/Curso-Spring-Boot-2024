package com.curso.proyectofinal.service;

import com.curso.proyectofinal.model.Venta;
import com.curso.proyectofinal.repository.IVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class VentaService implements IVentaService {

    @Autowired
    private IVentaRepository ventaRepository;

    @Override
    public void saveVenta(Venta venta) {
        ventaRepository.save(venta);
    }

    @Override
    public List<Venta> traerVentas() {
        List<Venta> ventas;
        ventas = ventaRepository.findAll();
        return ventas;
    }

    @Override
    public Venta traerVenta(Long id) {
        Venta venta;
        venta = ventaRepository.findById(id).orElse(null);
        return venta;
    }

    @Override
    public void eliminarVenta(Long id) {
        ventaRepository.deleteById(id);
    }

    @Override
    public Venta editarVenta(Long idVenta, LocalDate fecha, double total) {
        Venta venta;
        venta = ventaRepository.findById(idVenta).orElse(null);
        if (venta != null) {
            venta.setFecha_venta(fecha);
            venta.setTotal(total);
            ventaRepository.save(venta);
        }
        return venta;
    }
}
