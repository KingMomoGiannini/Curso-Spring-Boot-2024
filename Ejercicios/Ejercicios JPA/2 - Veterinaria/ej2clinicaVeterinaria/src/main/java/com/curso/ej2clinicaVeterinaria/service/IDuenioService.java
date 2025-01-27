package com.curso.ej2clinicaVeterinaria.service;

import com.curso.ej2clinicaVeterinaria.model.Duenio;

import java.util.List;

public interface IDuenioService {

    public List<Duenio> getDuenios();

    public void saveDuenio(Duenio duenio);

    public void deleteDuenio(Long id);

    public Duenio findDuenio(Long id);

    public Duenio editDuenio(Long id, String nombre,String apellido,String celular, String dni);
}
