package com.example.demo.Student;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
@Component
public class StudentService {
    public List<Student> getStudent(){
        return List.of(new Student(1L,
                "tanveer",
                "tanveerjurej@gmail.com",
                LocalDate.of(2001,7,6),
                15)
        );
    }
}
