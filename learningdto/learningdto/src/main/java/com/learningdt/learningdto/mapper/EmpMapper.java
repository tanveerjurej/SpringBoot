package com.learningdt.learningdto.mapper;

import com.learningdt.learningdto.dto.EmployeeDto;
import com.learningdt.learningdto.model.Employees;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class EmpMapper {
    public  EmployeeDto employeeToDto(Employees employees){
        if (Objects.isNull(employees)){
            return null;
        }
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employees.getId());
        employeeDto.setFirstName(employees.getFirstName());
        employeeDto.setLastName(employees.getLastName());
        employeeDto.setEmail(employees.getEmail());
        return employeeDto;
    }
//            public List<EmployeeDto> employeeToDto(List<Employees> employees) {
//                return employees.stream().map(m -> employeeToDto(m)).collect(Collectors.toList());
//
//            }
    public  Employees dtoToEmployees(EmployeeDto employeeDto){
        Employees employees = new Employees();
        employees.setId(employees.getId());
        employees.setFirstName(employeeDto.getFirstName());
        employees.setLastName(employeeDto.getLastName());
        employees.setEmail(employeeDto.getEmail());
        return employees;

    }
//    public List<Employees> dtoToEmployees(List<EmployeeDto> employeesDto) {
//        return  employeesDto.stream().map(m -> dtoToEmployees(m)).collect(Collectors.toList());
//
//  }
}
