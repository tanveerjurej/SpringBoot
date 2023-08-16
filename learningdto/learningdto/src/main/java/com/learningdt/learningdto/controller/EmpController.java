package com.learningdt.learningdto.controller;

import com.learningdt.learningdto.dto.EmployeeDto;
import com.learningdt.learningdto.model.Employees;
import com.learningdt.learningdto.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    EmpService empService;

    @PostMapping("/save")
    public EmployeeDto saveEmp(@RequestBody EmployeeDto employeeDto){
        return empService.saveData(employeeDto);
    }

    @GetMapping("/getAll")
    public List<EmployeeDto> findAll() {
        return empService.getAll();
    }
}
