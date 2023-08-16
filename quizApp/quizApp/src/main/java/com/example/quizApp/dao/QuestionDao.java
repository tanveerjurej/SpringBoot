package com.example.quizApp.dao;


import com.example.quizApp.service.Quizquest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDao extends  JpaRepository<Quizquest, Integer> {
}
