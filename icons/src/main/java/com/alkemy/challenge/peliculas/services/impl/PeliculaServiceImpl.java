package com.alkemy.challenge.peliculas.services.impl;

import com.alkemy.challenge.peliculas.dto.PeliculaDTO;
import com.alkemy.challenge.peliculas.entity.PeliculaEntity;
import com.alkemy.challenge.peliculas.mapper.PeliculaMapper;
import com.alkemy.challenge.peliculas.repository.PeliculaRepository;
import com.alkemy.challenge.peliculas.services.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PeliculaServiceImpl implements PeliculaService {

    @Autowired
    private PeliculaMapper peliculaMapper;
    @Autowired
    private PeliculaRepository peliculaRepository;


    public PeliculaDTO save(PeliculaDTO dto) {
        PeliculaEntity entity = peliculaMapper.peliculaDTO2Entity(dto);
        PeliculaEntity entitySaved = peliculaRepository.save(entity);
        PeliculaDTO resultado = peliculaMapper.peliculaEntity2DTO(entitySaved,false);
        return resultado;
    }

    public List<PeliculaDTO> getAllPeliculas() {
        List<PeliculaEntity> entities = peliculaRepository.findAll();
        List<PeliculaDTO> devolucion = peliculaMapper.peliculaEntity2DTOList(entities,false);
        return devolucion;
    }

    public void delete(Long id) {
        this.peliculaRepository.deleteById(id);
    }


}
