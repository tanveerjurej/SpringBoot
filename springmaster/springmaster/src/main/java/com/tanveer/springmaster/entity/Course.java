package com.tanveer.springmaster.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int CourseId;
    String CourseTitle;
    String CourseCredit;

    @OneToOne
    private CourseMaterial courseMaterial;
}
