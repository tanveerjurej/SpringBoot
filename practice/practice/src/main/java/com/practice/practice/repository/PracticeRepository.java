package com.practice.practice.repository;

import com.practice.practice.model.PracticeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PracticeRepository extends JpaRepository<PracticeModel, Integer> {
}
