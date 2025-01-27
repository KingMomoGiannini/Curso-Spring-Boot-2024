package com.curso.ej2clinicaVeterinaria.repository;

import com.curso.ej2clinicaVeterinaria.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMascotaRepository extends JpaRepository<Mascota, Long> {
}
