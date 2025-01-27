package com.curso.ej2clinicaVeterinaria.service;


import com.curso.ej2clinicaVeterinaria.model.Mascota;

import java.util.List;

public interface IMascotaService {
    public List<Mascota> getMascotas();

    public void saveMascota(Mascota mascota);

    public void deleteMascota(Long id);

    public Mascota findMascota(Long id);

    public Mascota editMascota(Long id, String nombre, String raza, String color, String especie);
}
