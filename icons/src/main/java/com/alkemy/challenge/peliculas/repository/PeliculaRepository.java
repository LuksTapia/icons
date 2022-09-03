package com.alkemy.challenge.peliculas.repository;


import com.alkemy.challenge.peliculas.entity.PeliculaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends JpaRepository<PeliculaEntity, Long> {


}
