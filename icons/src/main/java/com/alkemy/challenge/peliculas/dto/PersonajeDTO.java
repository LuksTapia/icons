package com.alkemy.challenge.peliculas.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.util.List;

@Getter
@Setter
public class PersonajeDTO {

    private Long id;
    private String imagen;
    private String nombre;
    private int edad;
    private float peso;
    private String historia;
    private List<PeliculaDTO> peliculas;

}
