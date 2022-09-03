package com.alkemy.challenge.peliculas.entity;

import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "generos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@SQLDelete(sql = "UPDATE icon SET deleted = true WHERE id=?")
@Where(clause = "deleted = false")

public class GeneroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

    private String imagen;

    @OneToMany(mappedBy = "genero", cascade = CascadeType.ALL)
    private List<PeliculaEntity> peliculas;

    private boolean delete = Boolean.FALSE;










}
