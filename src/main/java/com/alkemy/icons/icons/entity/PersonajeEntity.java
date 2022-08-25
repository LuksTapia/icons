package com.alkemy.icons.icons.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "personaje")
@Getter
@Setter

public class PersonajeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private Long id;

    private String imagen;

    private String nombre;

    private int edad;

    private float peso;

    private String historia;

    @ManyToMany(mappedBy = "personajes", cascade = CascadeType.ALL)
    private List<PeliculaEntity> peliculas = new ArrayList<>();

    public void addPelicula(PeliculaEntity pelicula) {
        this.peliculas.add(pelicula);
    }
    public void removePelicula(PeliculaEntity pelicula) {
        this.peliculas.remove(pelicula);
    }



}
