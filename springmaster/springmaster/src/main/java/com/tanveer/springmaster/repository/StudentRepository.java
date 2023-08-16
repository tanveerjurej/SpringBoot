package com.tanveer.springmaster.repository;

import com.tanveer.springmaster.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {



}
