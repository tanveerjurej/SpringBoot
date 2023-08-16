package com.tanveer.springmaster.repository;

import com.tanveer.springmaster.entity.Course;
import com.tanveer.springmaster.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository repo;

    @Test
     public void saveCourseMaterial(){

         Course course = Course.builder()
                 .CourseCredit("1000").CourseTitle("Google Builder").build();

         CourseMaterial courseMaterial = CourseMaterial.builder()
                 .Link("www.udemy.com").course(course)
                 .build();

         repo.save(courseMaterial);

     }

     @Test
     public void findCourseMaterial(){
        List<CourseMaterial> courseMaterial = repo.findAll();
         System.out.println(courseMaterial);
     }



}