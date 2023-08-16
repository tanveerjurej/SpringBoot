package com.myproject.Quizproject.controller;

import com.myproject.Quizproject.model.Wrapper;
import com.myproject.Quizproject.model.quizquest;
import com.myproject.Quizproject.service.QuizService;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("Quiz")
public class QuizController {

    @Autowired
    QuizService quizService;


    @PostMapping("Create")
    public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int NumOfQ, @RequestParam String title){
        return quizService.createQuiz(category,NumOfQ,title);


    }
    @GetMapping("getQuest")
    public ResponseEntity<List<Wrapper>> quizQuestion(@PathVariable IntegerPa id){
        return quizService.getQuizQuestion(id);


    }


}