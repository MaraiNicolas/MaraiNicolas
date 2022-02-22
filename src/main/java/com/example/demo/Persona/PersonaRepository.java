package com.example.demo.Persona;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

    @Query("SELECT p FROM Persona p WHERE p.dni = ?1")
    Optional<Persona> findPersonaByDni(String dni);

    @Query("SELECT p FROM Persona p WHERE p.id = ?1")
    Optional<Persona> findById(Long id);
}
