package com.prueba.giraldo.service.Impl;

import com.prueba.giraldo.dto.EmployeeDto;
import com.prueba.giraldo.dto.EmployeeSaveDto;
import com.prueba.giraldo.entities.EmployeeEntity;
import com.prueba.giraldo.repositories.EmployeeRepository;
import com.prueba.giraldo.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;

@Service
public class EmployeeServiceImplement implements EmployeeService {

    private EmployeeRepository employeeRepository;
    public  EmployeeServiceImplement(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
    @Override
    public EmployeeDto save(EmployeeSaveDto newUser) {
        ModelMapper modelMapper = new ModelMapper();
        newUser.setCreateAt(new Timestamp(new Date().getTime()));
        newUser.setStatus(true);
        System.out.println(newUser.getCountry());
        EmployeeEntity employeeEntity = employeeRepository.save(modelMapper.map(newUser, EmployeeEntity.class));
        return modelMapper.map(employeeEntity, EmployeeDto.class);
    }
}
