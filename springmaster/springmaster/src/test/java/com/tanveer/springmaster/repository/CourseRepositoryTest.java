package com.tanveer.springmaster.repository;

import com.tanveer.springmaster.entity.Course;
import com.tanveer.springmaster.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class CourseRepositoryTest {
    @Autowired
    private CourseRepository repo;

    @Test
    public void saveCourse(){
        CourseMaterial courseMaterial = CourseMaterial.builder().Link("www.udemy.com").build();
        Course course1 = Course.builder().CourseTitle("Spring web").CourseCredit("1205").build();
        repo.save(course1);
    }

}