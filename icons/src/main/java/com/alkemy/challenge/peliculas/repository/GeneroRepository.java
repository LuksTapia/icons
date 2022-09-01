package com.alkemy.challenge.peliculas.repository;

import com.alkemy.challenge.peliculas.entity.GeneroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//Los repositorios deben ser de tipo interface, para no tener que override los métodos. El que habla con la
//base de datos.
@Repository
public interface GeneroRepository extends JpaRepository<GeneroEntity, Long> {



}
