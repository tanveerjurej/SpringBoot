package com.example.quizApp.service;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data //used to avoid for line shorting such as getter setter and constructor
public class Quizquest {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int Id;
    private String Question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String answer;

}
