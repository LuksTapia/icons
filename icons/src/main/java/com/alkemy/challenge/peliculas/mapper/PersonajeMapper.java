package com.alkemy.challenge.peliculas.mapper;

import com.alkemy.challenge.peliculas.dto.PeliculaDTO;
import com.alkemy.challenge.peliculas.dto.PersonajeBasicDTO;
import com.alkemy.challenge.peliculas.dto.PersonajeDTO;
import com.alkemy.challenge.peliculas.entity.PeliculaEntity;
import com.alkemy.challenge.peliculas.entity.PersonajeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;


@Component
public class PersonajeMapper {

    @Autowired
    private PeliculaMapper peliculaMapper;

    public PersonajeEntity personajeDTO2Entity(PersonajeDTO dto) {
        PersonajeEntity personajeEntity = new PersonajeEntity();
        personajeEntity.setImagen(dto.getImagen());
        personajeEntity.setNombre(dto.getNombre());
        personajeEntity.setEdad(dto.getEdad());
        personajeEntity.setPeso(dto.getPeso());
        personajeEntity.setHistoria(dto.getHistoria());
        return personajeEntity;
    }

    public PersonajeDTO personajeEntity2DTO(PersonajeEntity entity, boolean loadPelicula) {
        PersonajeDTO dto = new PersonajeDTO();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setNombre(entity.getNombre());
        dto.setEdad(entity.getEdad());
        dto.setPeso(entity.getPeso());
        dto.setHistoria(entity.getHistoria());
        if(loadPelicula) {
         List<PeliculaDTO> peliculaDTOS = this.peliculaMapper.peliculaEntity2DTOList(entity.getPeliculas(),false);
         dto.setPeliculas(peliculaDTOS);
        }
        return dto;
    }

    public List<PersonajeDTO> personajeEntity2DTOList(List<PersonajeEntity> personajesEntity, boolean loadPelicula) {
        List<PersonajeDTO> resultado = new ArrayList<>();
        for (PersonajeEntity personaje : personajesEntity) {
            resultado.add(this.personajeEntity2DTO(personaje, loadPelicula));

        }

        return resultado;

    }

    public List<PersonajeBasicDTO> peliculaEntitySetBasic2DTOList(Collection<PersonajeEntity> entities) {
        List<PersonajeBasicDTO> dtos = new ArrayList<>();
        PersonajeBasicDTO basicDTO;
        for(PersonajeEntity entity : entities) {
            basicDTO = new PersonajeBasicDTO();
            basicDTO.setId(entity.getId());
            basicDTO.setImagen(entity.getImagen());
            basicDTO.setNombre(entity.getNombre());
            dtos.add(basicDTO);
        }
        return dtos;
    }
}
