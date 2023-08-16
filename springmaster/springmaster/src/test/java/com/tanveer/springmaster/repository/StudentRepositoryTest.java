package com.tanveer.springmaster.repository;

import com.tanveer.springmaster.entity.Guardian;
import com.tanveer.springmaster.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository repo;


    @Test
    public void saveStudent(){
        Guardian guardian = Guardian.builder().name("bappa").email("bappa@email.com").mobile("1351252655").build();
        Student student = Student.builder().firstName("beta").lastName("Ahmad").studentEmail("@email.com").guardian(guardian)
                .build();
        repo.save(student);
    }

}