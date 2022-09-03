package com.alkemy.challenge.peliculas.dto;

import com.alkemy.challenge.peliculas.entity.PeliculaEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
public class PeliculaDTO {

    private Long id;
    private String imagen;
    private String titulo;
    private LocalDate fechaCreacion;
    private int calificacion;
    private Long generoId;
    private List<PersonajeDTO> personajeDTOS;




}
