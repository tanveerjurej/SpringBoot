package com.myproject.Quizproject.questionrepo;

import com.myproject.Quizproject.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
}
