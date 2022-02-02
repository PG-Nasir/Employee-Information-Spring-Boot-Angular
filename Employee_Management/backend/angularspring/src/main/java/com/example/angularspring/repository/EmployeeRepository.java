package com.example.angularspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.angularspring.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
