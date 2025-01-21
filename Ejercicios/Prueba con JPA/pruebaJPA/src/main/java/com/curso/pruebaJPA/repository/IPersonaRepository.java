package com.curso.pruebaJPA.repository;

import com.curso.pruebaJPA.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {

}
