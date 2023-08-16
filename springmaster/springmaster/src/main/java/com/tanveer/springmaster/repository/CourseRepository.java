package com.tanveer.springmaster.repository;

import com.tanveer.springmaster.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
