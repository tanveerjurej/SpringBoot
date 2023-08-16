package com.myproject.Quizproject.controller;

import com.myproject.Quizproject.service.QuestionService;
import com.myproject.Quizproject.model.quizquest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class Controller {
    @Autowired
    QuestionService questionservice;


    @GetMapping("getAllQuestion")
    public ResponseEntity<List<quizquest>> getAllQuestion(){
        return questionservice.getAllQuestion();
    }


    @GetMapping("category/{category}")
    public ResponseEntity<List<quizquest>> getQuestionByCategory(@PathVariable String category){
        return questionservice.getQuestionByCategory(category);
    }
    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody quizquest questionall){
        return questionservice.addQuestion(questionall);

    }

    @DeleteMapping("delete")
    public String deleteQuestion(@RequestParam int Id){
        return questionservice.deleteQuestion(Id);

    }

}
