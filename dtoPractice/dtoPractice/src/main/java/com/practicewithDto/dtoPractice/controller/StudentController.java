package com.practicewithDto.dtoPractice.controller;


import com.practicewithDto.dtoPractice.dto.StudentDto;
import com.practicewithDto.dtoPractice.entity.Student;
import com.practicewithDto.dtoPractice.exception.StdntException;
import com.practicewithDto.dtoPractice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;




    @PostMapping("/add")
    public StudentDto addStudent(@RequestBody StudentDto studentDto){
        return studentService.saveStudent(studentDto);

    }


    @GetMapping("/getAll")
    public List<StudentDto> getAllStudent(){
        return studentService.findAllStudent();
    }


    @GetMapping("/get/{id}")
    public StudentDto getStudent(@PathVariable long id) throws StdntException {
        return studentService.getStudentById(id);
    }

    @GetMapping("/getname/{name}")
    public StudentDto getStudentByName(@PathVariable String name){
        return studentService.getStudentByName(name);
    }
    @PutMapping("/update")
    public StudentDto updateStudent(@RequestBody Student student){
        return studentService.updateById(student);
    }

}
