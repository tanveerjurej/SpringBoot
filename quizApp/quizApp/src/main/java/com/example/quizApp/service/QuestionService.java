package com.example.quizApp.service;

import com.example.quizApp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//we can use Component and service both as annotation
@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;


    public List<Quizquest> getAllQuestion() {

        return questionDao.findAll();
    }
}
