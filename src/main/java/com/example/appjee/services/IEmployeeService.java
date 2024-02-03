package com.example.appjee.services;

import com.example.appjee.entities.Employee;
import com.example.appjee.models.EmployeeModel;

import java.util.List;
import java.util.Optional;


public interface IEmployeeService {
    Employee AddEmployee(EmployeeModel employee);
    List<Employee> findAll();
    Optional<Employee> findById(Long employeeId);
}
