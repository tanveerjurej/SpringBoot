package com.myproject.Quizproject.model;

import lombok.Data;

@Data
public class Wrapper {
    private int Id;
    private String Question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;

    public Wrapper(int id, String question, String option1, String option2, String option3, String option4) {
        Id = id;
        Question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }
}
