package com.practicewithDto.dtoPractice.service;

import com.practicewithDto.dtoPractice.dto.StudentDto;
import com.practicewithDto.dtoPractice.entity.Student;
import com.practicewithDto.dtoPractice.exception.StdntException;

import java.util.List;

public interface StudentService {
    StudentDto saveStudent(StudentDto studentDto);

    List<StudentDto> findAllStudent();

    StudentDto getStudentById(long id) throws StdntException;

    StudentDto getStudentByName(String name);

    StudentDto updateById(Student student);
}
