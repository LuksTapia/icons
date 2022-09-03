package com.alkemy.challenge.peliculas.services;


import com.alkemy.challenge.peliculas.dto.PeliculaDTO;

import java.util.List;

public interface PeliculaService {


    PeliculaDTO save(PeliculaDTO dto);

    List<PeliculaDTO> getAllPeliculas();

    void delete(Long id);


}
