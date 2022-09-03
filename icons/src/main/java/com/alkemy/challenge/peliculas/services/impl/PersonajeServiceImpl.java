package com.alkemy.challenge.peliculas.services.impl;


import com.alkemy.challenge.peliculas.dto.PersonajeDTO;
import com.alkemy.challenge.peliculas.entity.PersonajeEntity;
import com.alkemy.challenge.peliculas.mapper.PersonajeMapper;
import com.alkemy.challenge.peliculas.repository.PersonajeRepository;
import com.alkemy.challenge.peliculas.services.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonajeServiceImpl implements PersonajeService {

    @Autowired
    private PersonajeMapper personajeMapper;
    @Autowired
    private PersonajeRepository personajeRepository;

    public PersonajeDTO save(PersonajeDTO dto) {
        PersonajeEntity personajeEntity = personajeMapper.personajeDTO2Entity(dto);
        PersonajeEntity entitySaved = personajeRepository.save(personajeEntity);
        PersonajeDTO personajeResult = personajeMapper.personajeEntity2DTO(entitySaved,false);
        return personajeResult;

    }
    public List<PersonajeDTO> getAllPersonajes() {
        List<PersonajeEntity> personajeEntities = this.personajeRepository.findAll();
        List<PersonajeDTO> personajeDTOs = this.personajeMapper.personajeEntity2DTOList(personajeEntities,false);
        return personajeDTOs;
    }

    @Override
    public PersonajeDTO update(Long id, PersonajeDTO personaje) {
        return null;
    }


    public void delete(Long id) {
        this.personajeRepository.deleteById(id);

    }

}
