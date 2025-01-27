package com.curso.ej2clinicaVeterinaria.service;

import com.curso.ej2clinicaVeterinaria.model.Mascota;
import com.curso.ej2clinicaVeterinaria.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService implements IMascotaService{

    @Autowired
    private IMascotaRepository mascotaRepository;

    @Override
    public List<Mascota> getMascotas() {
        List<Mascota> mascotas = null;
        mascotas = mascotaRepository.findAll();
        return mascotas;
    }

    @Override
    public void saveMascota(Mascota mascota) {
        mascotaRepository.save(mascota);
    }

    @Override
    public void deleteMascota(Long id) {
        mascotaRepository.deleteById(id);
    }

    @Override
    public Mascota findMascota(Long id) {
        Mascota masc = mascotaRepository.findById(id).orElse(null);
        return masc;
    }

    @Override
    public Mascota editMascota(Long id, String nombre, String raza, String color, String especie) {
        Mascota mascota = this.findMascota(id);
        mascota.setNombre(nombre);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setEspecie(especie);
        this.saveMascota(mascota);
        return mascota;
    }

}
