package com.prueba.giraldo.controllers;

import com.prueba.giraldo.dto.EmployeeDto;
import com.prueba.giraldo.dto.EmployeeSaveDto;
import com.prueba.giraldo.entities.EmployeeEntity;
import com.prueba.giraldo.repositories.EmployeeRepository;
import com.prueba.giraldo.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value ="/employee")
public class EmployeeController {

    private final EmployeeService service;
    private final EmployeeRepository repository;

    public EmployeeController(EmployeeRepository repository, EmployeeService service) {
        this.repository = repository;
        this.service = service;
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
    public EmployeeDto newUser(@RequestBody EmployeeSaveDto newUser){
        return service.save(newUser);
    }

    @PostMapping(value = "/edit")
    public EmployeeEntity edit(@RequestBody EmployeeSaveDto newUser) {
        ModelMapper mapper = new ModelMapper();
        return repository.save(mapper.map(newUser, EmployeeEntity.class));
    }

    @GetMapping(value = "/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        ModelMapper modelMapper = new ModelMapper();
        EmployeeEntity employee = modelMapper.map(this.repository.findById(id), EmployeeEntity.class);
        this.repository.delete(employee);
    }
}
