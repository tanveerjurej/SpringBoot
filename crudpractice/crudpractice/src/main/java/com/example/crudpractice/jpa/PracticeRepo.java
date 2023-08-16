package com.example.crudpractice.jpa;

import com.example.crudpractice.model.PracticeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PracticeRepo extends JpaRepository<PracticeModel, Integer> {
}
