package com.prueba.giraldo.service;

import com.prueba.giraldo.entities.EmployeeEntity;
import com.prueba.giraldo.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImplement implements  EmployeeService{

    private EmployeeRepository employeeRepository;
    public  EmployeeServiceImplement(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
    @Override
    public EmployeeEntity save(EmployeeEntity newUser) {
        return employeeRepository.save(newUser);
    }
}
