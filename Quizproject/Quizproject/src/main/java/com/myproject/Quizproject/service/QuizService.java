package com.myproject.Quizproject.service;

import com.myproject.Quizproject.model.Quiz;
import com.myproject.Quizproject.model.Wrapper;
import com.myproject.Quizproject.model.quizquest;
import com.myproject.Quizproject.questionrepo.QuestionJpa;
import com.myproject.Quizproject.questionrepo.QuizDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class QuizService {

    @Autowired
    QuizDao quizDao;

    @Autowired
    QuestionJpa questionJpa;


    public ResponseEntity<String> createQuiz(String category, int NumOfQ, String title) {

        List<quizquest> question = questionJpa.findQuestionsByCategory(category,NumOfQ);

        Quiz quiz = new Quiz();

        quiz.setTitle(title);
        quiz.setQuestion(question);
        quizDao.save(quiz);
        return new ResponseEntity<>("hh done", HttpStatus.CREATED);

    }

    public ResponseEntity<List<Wrapper>> getQuizQuestion(Integer id) {
        Optional<Quiz> quiz= quizDao.findById(id);
        List<quizquest> questionFromDB = quiz.get().getQuestion();
        List<Wrapper> questionForUser = new ArrayList<>();
        for (quizquest q: questionFromDB) {
            Wrapper w = new Wrapper(q.getId(), q.getQuestion(), q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4());
            questionForUser.add(w);

        }
        return new ResponseEntity<>(questionForUser, HttpStatus.OK);
    }
}
