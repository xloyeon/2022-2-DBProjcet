package com.example.database.service;

import com.example.database.domain.EmployeeEntity;
import com.example.database.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<EmployeeEntity> findAll(){
        return employeeRepository.findAll();
    }

    public EmployeeEntity save(EmployeeEntity employeeEntity){
        employeeRepository.save(employeeEntity);
        return employeeEntity;
    }
}
