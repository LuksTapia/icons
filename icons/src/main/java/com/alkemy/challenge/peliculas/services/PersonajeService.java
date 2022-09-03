package com.alkemy.challenge.peliculas.services;

import com.alkemy.challenge.peliculas.dto.PersonajeDTO;

import java.util.List;

public interface PersonajeService {

    PersonajeDTO save(PersonajeDTO personaje);

    List<PersonajeDTO> getAllPersonajes();

    PersonajeDTO update(Long id, PersonajeDTO personaje);

    void delete(Long id);
}
