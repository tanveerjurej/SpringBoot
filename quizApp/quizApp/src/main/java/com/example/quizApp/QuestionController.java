package com.example.quizApp;


import com.example.quizApp.service.QuestionService;
import com.example.quizApp.service.Quizquest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.pattern.PathPatternParser.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;
    @GetMapping("getAllQuestion")
    public List<Quizquest> GetAllQuestion(){
        return questionService.getAllQuestion();
    }
}
