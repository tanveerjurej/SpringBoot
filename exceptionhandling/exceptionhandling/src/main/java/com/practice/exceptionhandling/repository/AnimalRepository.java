package com.practice.exceptionhandling.repository;

import com.practice.exceptionhandling.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    public Optional<Animal> findByanimal(String animal);
}
