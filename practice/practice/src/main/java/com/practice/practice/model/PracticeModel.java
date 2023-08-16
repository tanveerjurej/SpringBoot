package com.practice.practice.model;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Service;


@Entity
@Data
public class PracticeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String sport;
    private int age;

}
