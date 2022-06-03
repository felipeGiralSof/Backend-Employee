package com.prueba.giraldo.service;

import com.prueba.giraldo.dto.EmployeeDto;
import com.prueba.giraldo.dto.EmployeeSaveDto;

public interface EmployeeService {
    EmployeeDto save(EmployeeSaveDto newUser);
}
