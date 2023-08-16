package com.tanveer.springmaster.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = "course")
public class CourseMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int CourseMaterialId;
    String Link;

    @OneToOne(cascade = CascadeType.ALL)
    Course course;
}
