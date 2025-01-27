package com.curso.ej2clinicaVeterinaria.repository;

import com.curso.ej2clinicaVeterinaria.model.Duenio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDuenioRepository extends JpaRepository<Duenio, Long> {
}
