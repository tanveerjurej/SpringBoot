package com.tanveer.springmaster.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.springframework.core.StandardReflectionParameterNameDiscoverer;

import java.util.List;

@Entity
@Data
@Builder
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int teacherId;
    private String firstName;
    private String lastName;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Course> courseList;
}
