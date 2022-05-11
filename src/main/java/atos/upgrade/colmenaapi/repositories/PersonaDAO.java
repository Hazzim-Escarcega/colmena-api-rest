package atos.upgrade.colmenaapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import atos.upgrade.colmenaapi.entities.Persona;

@Repository
public interface PersonaDAO extends JpaRepository<Persona, Long> {
}
