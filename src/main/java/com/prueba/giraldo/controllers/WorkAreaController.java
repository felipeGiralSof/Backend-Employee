package com.prueba.giraldo.controllers;

import com.prueba.giraldo.entities.WorkAreaEntity;
import com.prueba.giraldo.repositories.WorkAreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/work_area")
public class WorkAreaController {
    private final WorkAreaRepository repository;

    public WorkAreaController(WorkAreaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public @ResponseBody Iterable<WorkAreaEntity> getAll() {
        return repository.findAll();
    }
}
