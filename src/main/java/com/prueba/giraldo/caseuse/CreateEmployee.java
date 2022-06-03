package com.prueba.giraldo.caseuse;


import com.prueba.giraldo.entities.EmployeeEntity;
import com.prueba.giraldo.service.EmployeeService;
import org.springframework.stereotype.Component;

@Component
public class CreateEmployee {
    private EmployeeService employeeService;

    public CreateEmployee(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    public EmployeeEntity save(EmployeeEntity newUser){
        return employeeService.save(newUser);
    }

}
