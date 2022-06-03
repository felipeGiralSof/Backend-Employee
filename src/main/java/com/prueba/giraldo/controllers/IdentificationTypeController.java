package com.prueba.giraldo.controllers;

import com.prueba.giraldo.entities.IdentificationTypeEntity;
import com.prueba.giraldo.repositories.IdentificationTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "identification_type")
public class IdentificationTypeController {
    private final IdentificationTypeRepository repository;

    public IdentificationTypeController(IdentificationTypeRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public @ResponseBody Iterable<IdentificationTypeEntity> getAll() {
        return repository.findAll();
    }
}
