package com.practicewithDto.dtoPractice.service;

import com.practicewithDto.dtoPractice.dto.StudentDto;
import com.practicewithDto.dtoPractice.entity.Student;
import com.practicewithDto.dtoPractice.exception.StdntException;
import com.practicewithDto.dtoPractice.mapper.StudentMapper;
import com.practicewithDto.dtoPractice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
public class ServiceImpl implements StudentService{

    @Autowired
    private StudentRepository repo;

    @Autowired
    private StudentMapper studentMapper;

    @Value("${tanveer.student.not.found.code}")
    private String studentNotFound;
    @Value("${tanveer.student.not.found.message}")
    private String studentNotFoundMessage;

    @Override
    public StudentDto saveStudent(StudentDto studentDto) {
        Student student = repo.save(studentMapper.studentDtoToStudent(studentDto));
        return studentMapper.studentToStudentDto(student);
    }

    @Override
    public List<StudentDto> findAllStudent() {
        //List<StudentDto> studentDtos= new ArrayList<>();
        List<Student> student = repo.findAll();
        //for (Student student1:student) {
          //  studentDtos.add(studentMapper.studentToStudentDto(student1));
        //}
        //return studentDtos;
        return student.stream().map(studentMapper::studentToStudentDto).toList();

    }

    @Override
    public StudentDto getStudentById(long id) throws StdntException {
        Optional<Student> student = repo.findById(id);
        if (student.isEmpty()){
            throw new StdntException(studentNotFound,studentNotFoundMessage, HttpStatus.NOT_FOUND);

        }
        return studentMapper.studentToStudentDto(student.get());
    }

    @Override
    public StudentDto getStudentByName(String name) {
        Student student = repo.getByName(name);
        return studentMapper.studentToStudentDto(student);
    }

    @Override
    public StudentDto updateById(Student student) {
        Student student1 = repo.save(student);
        return studentMapper.studentToStudentDto(student);
    }
}
