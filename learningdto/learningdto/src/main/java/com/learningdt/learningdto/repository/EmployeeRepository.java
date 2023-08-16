package com.learningdt.learningdto.repository;

import com.learningdt.learningdto.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employees, Integer> {
}
