package com.learningdt.learningdto.service;

import com.learningdt.learningdto.dto.EmployeeDto;
import com.learningdt.learningdto.mapper.EmpMapper;
import com.learningdt.learningdto.model.Employees;
import com.learningdt.learningdto.repository.EmployeeRepository;
import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.ObjectName;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class EmpService {
    @Autowired
    EmployeeRepository repo;
    @Autowired
     EmpMapper empMapper;


    public EmployeeDto saveData(EmployeeDto employeeDto) {
        Employees employees=repo.save(empMapper.dtoToEmployees(employeeDto));
        return empMapper.employeeToDto(employees);

    }

    public List<EmployeeDto> getAll() {
        List<EmployeeDto> employeeDtos = new ArrayList<>();
        List<Employees> employee = repo.findAll();
        //return employee.stream().map(s-> empMapper.employeeToDto(s)).collect(Collectors.toList());
        for (Employees emp:employee) {
            employeeDtos.add(empMapper.employeeToDto(emp));

        }


        return employeeDtos;
    }
}
