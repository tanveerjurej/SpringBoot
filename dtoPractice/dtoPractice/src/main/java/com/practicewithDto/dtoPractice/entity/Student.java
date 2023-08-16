package com.practicewithDto.dtoPractice.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    @Column(unique = true)
    private String email;

    private String branch;

}
