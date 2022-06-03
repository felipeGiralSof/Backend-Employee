package com.prueba.giraldo.controllers;

import com.prueba.giraldo.caseuse.CreateEmployee;
import com.prueba.giraldo.entities.EmployeeEntity;
import com.prueba.giraldo.repositories.EmployeeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value ="/employee")
public class EmployeeController {
    private final EmployeeRepository repository;
    private final CreateEmployee createEmployee;

    public EmployeeController(EmployeeRepository repository, CreateEmployee createEmployee) {
        this.repository = repository;
        this.createEmployee = createEmployee;
    }

    @GetMapping
    public @ResponseBody Iterable<EmployeeEntity> getAll() {
        return this.repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<EmployeeEntity> getById(@PathVariable("id") Integer id) {
        return this.repository.findById(id);
    }

    @PostMapping
    public ResponseEntity<EmployeeEntity> newUser(@RequestBody EmployeeEntity newUser){
        return new ResponseEntity<>(createEmployee.save(newUser), HttpStatus.CREATED);
    }
}
