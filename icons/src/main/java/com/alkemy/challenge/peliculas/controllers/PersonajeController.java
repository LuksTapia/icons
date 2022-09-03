package com.alkemy.challenge.peliculas.controllers;


import com.alkemy.challenge.peliculas.dto.PersonajeDTO;
import com.alkemy.challenge.peliculas.services.PersonajeService;
import com.alkemy.challenge.peliculas.services.impl.PersonajeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("personajes")
public class PersonajeController {

    @Autowired
    private PersonajeService personajeService;


    @PostMapping
    public ResponseEntity<PersonajeDTO> save(@RequestBody PersonajeDTO personaje) {
        PersonajeDTO personajeGuardado = personajeService.save(personaje);
        return ResponseEntity.status(HttpStatus.CREATED).body(personajeGuardado);

    }

    @PutMapping("/{id}")
    public ResponseEntity<PersonajeDTO> update(@PathVariable Long id, @RequestBody PersonajeDTO personaje) {
        PersonajeDTO result = this.personajeService.update(id, personaje);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.personajeService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


    @GetMapping
    public ResponseEntity<List<PersonajeDTO>> getAll() {
        List<PersonajeDTO> personajes = this.personajeService.getAllPersonajes();
        return ResponseEntity.ok().body(personajes);

    }


}
