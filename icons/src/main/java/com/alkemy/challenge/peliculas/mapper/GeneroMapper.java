package com.alkemy.challenge.peliculas.mapper;


import com.alkemy.challenge.peliculas.dto.GeneroDTO;
import com.alkemy.challenge.peliculas.entity.GeneroEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GeneroMapper {

    //defino metodo que reciba dto y devuelta entidad. Le seteo los atributos del dto.

    public GeneroEntity convertDTO2Entity(GeneroDTO dto) {
        //inicializamos un Entity
        GeneroEntity generoEntity = new GeneroEntity();
        generoEntity.setNombre(dto.getNombre());
        generoEntity.setImagen(dto.getImagen());
        return generoEntity;
    }

    public GeneroDTO convertEntity2DTO(GeneroEntity entity) {
        GeneroDTO dto = new GeneroDTO();
        dto.setId(entity.getId());
        dto.setNombre(entity.getNombre());
        dto.setImagen(entity.getImagen());
        return dto;
    }

    public List<GeneroDTO> convertEntityList2DTO(List<GeneroEntity> entities) {
        List<GeneroDTO> dtos = new ArrayList<>();
        for (GeneroEntity entity : entities) {
            dtos.add(this.convertEntity2DTO(entity));

        }
        return dtos;
    }





}
