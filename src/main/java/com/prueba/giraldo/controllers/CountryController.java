package com.prueba.giraldo.controllers;

import com.prueba.giraldo.entities.CountryEntity;
import com.prueba.giraldo.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/country")
public class CountryController {
    private final CountryRepository repository;

    public CountryController(CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public @ResponseBody Iterable<CountryEntity> getAll() {
        return repository.findAll();
    }
}
