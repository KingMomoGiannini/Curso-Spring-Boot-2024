package com.curso.ej2clinicaVeterinaria.service;

import com.curso.ej2clinicaVeterinaria.model.Duenio;
import com.curso.ej2clinicaVeterinaria.repository.IDuenioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DuenioService implements IDuenioService {

    @Autowired
    private IDuenioRepository duenioRepository;


    @Override
    public List<Duenio> getDuenios() {
        List<Duenio> duenios = duenioRepository.findAll();
        return duenios;
    }

    @Override
    public void saveDuenio(Duenio duenio) {
        duenioRepository.save(duenio);
    }

    @Override
    public void deleteDuenio(Long id) {
        duenioRepository.deleteById(id);
    }

    @Override
    public Duenio findDuenio(Long id) {
        Duenio elDuenio = duenioRepository.findById(id).orElse(null);
        return elDuenio;
    }

    @Override
    public Duenio editDuenio(Long id, String nombre, String apellido, String celular, String dni) {
        Duenio duenio = this.findDuenio(id);
        duenio.setNombre(nombre);
        duenio.setApellido(apellido);
        duenio.setCelular(celular);
        duenio.setDni(dni);
        this.saveDuenio(duenio);
        return duenio;
    }
}
