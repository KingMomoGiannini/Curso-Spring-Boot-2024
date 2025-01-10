package com.cursoSpringBoot.ej1Restaurante;

public class Plato {

    private int numero;
    private String nombre;
    private double precio;
    private String descripcion;

    public Plato(String nombre, int numero, double precio, String descripcion) {
        this.numero = numero;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public Plato() {
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
