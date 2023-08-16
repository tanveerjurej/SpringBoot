package com.myproject.Quizproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class quizquest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String Question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String answer;
    private String category;


}
