package com.myproject.Quizproject.questionrepo;

import com.myproject.Quizproject.model.quizquest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionJpa extends JpaRepository<quizquest, Integer> {

    List<quizquest> findByCategory(String category);

    @Query(value="SELECT * FROM quizquest q WHERE q.category=:category ORDER BY RAND() LIMIT :NumOfQ", nativeQuery = true)
    List<quizquest> findQuestionsByCategory(String category, int NumOfQ);



}
