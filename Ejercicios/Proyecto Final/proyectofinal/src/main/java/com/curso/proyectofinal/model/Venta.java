package com.curso.proyectofinal.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter@Setter
@Entity
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long codigo_venta;
    private LocalDate fecha_venta;
    private double total;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente unCliente;

    @ManyToMany
    @JoinTable(
            name = "venta_producto",
            joinColumns = @JoinColumn(name = "codigo_venta"),
            inverseJoinColumns = @JoinColumn(name = "codigo_producto")
    )
    private List<Producto> listaProductos;

    public Venta() {
    }

    public Venta(LocalDate fecha_venta, double total, Cliente unCliente, List<Producto> listaProductos) {
        this.fecha_venta = fecha_venta;
        this.total = total;
        this.unCliente = unCliente;
        this.listaProductos = listaProductos;
    }
}
