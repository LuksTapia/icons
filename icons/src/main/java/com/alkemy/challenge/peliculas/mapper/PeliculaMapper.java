package com.alkemy.challenge.peliculas.mapper;


import com.alkemy.challenge.peliculas.dto.PeliculaDTO;
import com.alkemy.challenge.peliculas.dto.PersonajeDTO;
import com.alkemy.challenge.peliculas.entity.PeliculaEntity;
import com.alkemy.challenge.peliculas.entity.PersonajeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Component
public class PeliculaMapper {

    @Autowired
    private PersonajeMapper personajeMapper;

    public PeliculaEntity peliculaDTO2Entity(PeliculaDTO dto) {
        PeliculaEntity resultado = new PeliculaEntity();
        resultado.setImagen(dto.getImagen());
        resultado.setTitulo(dto.getTitulo());
        resultado.setFechaCreacion(dto.getFechaCreacion());
        resultado.setCalificacion(dto.getCalificacion());
        resultado.setGeneroId(dto.getGeneroId());
        return resultado;
    }

    public PeliculaDTO peliculaEntity2DTO(PeliculaEntity entity, boolean loadPersonaje) {
        PeliculaDTO dto = new PeliculaDTO();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setTitulo(entity.getTitulo());
        dto.setFechaCreacion(entity.getFechaCreacion());
        dto.setCalificacion(entity.getCalificacion());
        dto.setGeneroId(entity.getGeneroId());
        if(loadPersonaje) {
            List<PersonajeDTO> personajeDTOS = this.personajeMapper.personajeEntity2DTOList((List<PersonajeEntity>) entity.getPersonajes(), false);
            dto.setPersonajeDTOS(personajeDTOS);
        }
        return dto;
    }

    public List<PeliculaDTO> peliculaEntity2DTOList(List<PeliculaEntity> entities, boolean loadPersonaje) {
        List<PeliculaDTO> dtos = new ArrayList<>();
        for (PeliculaEntity entity : entities) {
            dtos.add(this.peliculaEntity2DTO(entity, loadPersonaje));
        }
        return dtos;
    }






}
