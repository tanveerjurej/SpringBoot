package com.myproject.Quizproject.service;


import com.myproject.Quizproject.model.quizquest;
import com.myproject.Quizproject.questionrepo.QuestionJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionJpa dao;

    public ResponseEntity<List<quizquest>>getAllQuestion() {
        try {

            return new ResponseEntity<>(dao.findAll(), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<quizquest>>getQuestionByCategory( String category) {
        try {
            return new ResponseEntity<>(dao.findByCategory(category), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> addQuestion(quizquest questionall) {
        dao.save(questionall);
        return new ResponseEntity<>("success", HttpStatus.CREATED );
    }


    public String deleteQuestion(int Id) {
        dao.deleteById(Id);
        return "hey buddy you deleted the question";
    }
}
