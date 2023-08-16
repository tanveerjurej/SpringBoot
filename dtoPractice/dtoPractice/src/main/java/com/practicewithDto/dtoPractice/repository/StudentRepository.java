package com.practicewithDto.dtoPractice.repository;

import com.practicewithDto.dtoPractice.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {
    Student getByName(String name);
}
