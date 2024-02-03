package com.example.appjee.daos;

import com.example.appjee.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeDao extends JpaRepository<Employee, Long> {
    List<Employee> findByLastnameAndFirstname(String lastname, String firstname);
}
