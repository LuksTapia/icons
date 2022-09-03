package com.alkemy.challenge.peliculas.entity;


import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "personajes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@SQLDelete(sql = "UPDATE icon SET deleted = true WHERE id=?")
@Where(clause = "deleted = false")

public class PersonajeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private Long id;

    private String imagen;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

    @Column(name = "Edad", nullable = false)
    private int edad;

    @Column(name = "Peso",nullable = false)
    private float peso;

    private String historia;

    private boolean delete = Boolean.FALSE;

    @ManyToMany(mappedBy = "personajes")
    private List<PeliculaEntity> peliculas = new ArrayList<>();

    public void addPelicula(PeliculaEntity pelicula) {
        this.peliculas.add(pelicula);
    }
    public void removePelicula(PeliculaEntity pelicula) {
        this.peliculas.remove(pelicula);
    }





}
