package com.alkemy.challenge.peliculas.repository;


import com.alkemy.challenge.peliculas.entity.PersonajeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonajeRepository extends JpaRepository<PersonajeEntity, Long> {

}
