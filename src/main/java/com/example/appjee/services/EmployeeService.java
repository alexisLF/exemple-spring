package com.example.appjee.services;

import com.example.appjee.daos.EmployeeDao;
import com.example.appjee.entities.Employee;
import com.example.appjee.models.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    private EmployeeDao repository;

    public Employee AddEmployee(EmployeeModel employeemodel) {
        Employee employee = new Employee();
        employee.setFirstname(employeemodel.getFirstname());
        employee.setLastname(employeemodel.getLastname());
        return repository.save(employee);
    }

    public List<Employee> findAll() {
        return repository.findAll();
    }

    public Optional<Employee> findById(Long employeeId) {
        return repository.findById(employeeId);
    }
}
