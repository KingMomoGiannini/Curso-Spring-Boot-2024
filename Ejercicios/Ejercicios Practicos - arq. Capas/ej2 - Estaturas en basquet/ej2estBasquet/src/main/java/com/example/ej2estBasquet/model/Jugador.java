package com.example.ej2estBasquet.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Jugador {
    private Long id;
    private String nombre;
    private String apellido;
    private double estatura;
    private int edad;
    private double peso;

    public Jugador() {
    }

    public Jugador(Long id, String nombre, String apellido, double estatura, int edad, double peso) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estatura = estatura;
        this.edad = edad;
        this.peso = peso;
    }

}
/*JSON
[
    {
        "id": 1,
        "nombre": "Juan",
        "apellido": "Perez",
        "estatura": 1.8,
        "edad": 25,
        "peso": 80
    },
    {
        "id": 2,
        "nombre": "Pedro",
        "apellido": "Gomez",
        "estatura": 1.7,
        "edad": 22,
        "peso": 75
    },
    {
        "id": 3,
        "nombre": "Maria",
        "apellido": "Lopez",
        "estatura": 1.6,
        "edad": 20,
        "peso": 60
    },
    {
        "id": 4,
        "nombre": "Ana",
        "apellido": "Martinez",
        "estatura": 1.75,
        "edad": 23,
        "peso": 70
    },
    {
        "id": 5,
        "nombre": "Luis",
        "apellido": "Rodriguez",
        "estatura": 1.85,
        "edad": 27,
        "peso": 85
    }
]
 */