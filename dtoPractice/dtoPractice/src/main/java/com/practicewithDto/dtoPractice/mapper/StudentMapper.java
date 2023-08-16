package com.practicewithDto.dtoPractice.mapper;

import com.practicewithDto.dtoPractice.dto.StudentDto;
import com.practicewithDto.dtoPractice.entity.Student;
import org.springframework.stereotype.Component;

import java.util.Objects;


@Component
public class StudentMapper {



    public StudentDto studentToStudentDto(Student student){
        StudentDto studentDto = new StudentDto();
        if (Objects.isNull(student)){
            return null;
        }
        studentDto.setId(student.getId());
        studentDto.setName(student.getName());
        studentDto.setEmail(student.getEmail());
        studentDto.setBranch(student.getBranch());

        return studentDto;
    }
    public Student studentDtoToStudent(StudentDto studentDto){
        Student student = new Student();
        student.setId(studentDto.getId());
        student.setName(studentDto.getName());
        student.setEmail(studentDto.getEmail());
        student.setBranch(studentDto.getBranch());
        return student;
    }
}
