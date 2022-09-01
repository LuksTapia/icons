package com.alkemy.challenge.peliculas.services.impl;


import com.alkemy.challenge.peliculas.dto.GeneroDTO;
import com.alkemy.challenge.peliculas.entity.GeneroEntity;
import com.alkemy.challenge.peliculas.mapper.GeneroMapper;
import com.alkemy.challenge.peliculas.repository.GeneroRepository;
import com.alkemy.challenge.peliculas.services.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroServiceImpl implements GeneroService {

    @Autowired
    private GeneroMapper generoMapper;
    @Autowired
    private GeneroRepository generoRepository;

    public GeneroDTO save(GeneroDTO dto) {

        //inyectar el mapper, en la implementacion
        //para guardarlo, recibo un dto y lo convertimos en entidad. A traves del mapper.
        //Lo guardo usando una variable local del tipo GeneroEntity. La guardo en el repository
        //y genero el dto con esta última

        GeneroEntity generoEntity = generoMapper.convertDTO2Entity(dto);
        GeneroEntity generoEntitysaved = generoRepository.save(generoEntity);
        GeneroDTO result = generoMapper.convertEntity2DTO(generoEntitysaved);
        return result;

    }
    public List<GeneroDTO> getAllGeneros() {
        List<GeneroEntity> genderEntities = generoRepository.findAll();
        List<GeneroDTO> results = generoMapper.convertEntityList2DTO(genderEntities);
        return results;
    }


}
