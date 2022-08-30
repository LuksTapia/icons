package com.alkemy.challenge.continentes.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "generos")
@Getter
@Setter

public class GeneroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

    private String imagen;

    @OneToMany(mappedBy = "genero", cascade = CascadeType.ALL)
    private List<PeliculaEntity> peliculas;











}
