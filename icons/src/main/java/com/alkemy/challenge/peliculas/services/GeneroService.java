package com.alkemy.challenge.peliculas.services;

import com.alkemy.challenge.peliculas.dto.GeneroDTO;

import java.util.List;

public interface GeneroService {

    GeneroDTO save(GeneroDTO dto);

    List<GeneroDTO> getAllGeneros();
}


