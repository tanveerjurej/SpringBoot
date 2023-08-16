package com.practice.exceptionhandling.service;

import com.practice.exceptionhandling.error.AnimalNotFoundException;
import com.practice.exceptionhandling.model.Animal;

import java.util.List;
import java.util.Optional;

public interface ServiceInterface {
    public Animal addPet(Animal animal);

    public List<Animal> findAllAnimal();

    public Animal findYourAnimal(int id) throws AnimalNotFoundException;

     public Animal findByName(String animal) throws AnimalNotFoundException;
}
