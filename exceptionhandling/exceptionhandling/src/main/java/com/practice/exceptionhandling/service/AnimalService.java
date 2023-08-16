package com.practice.exceptionhandling.service;


import com.practice.exceptionhandling.error.AnimalNotFoundException;
import com.practice.exceptionhandling.model.Animal;
import com.practice.exceptionhandling.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AnimalService implements ServiceInterface{


    @Autowired
    private AnimalRepository repo;



    @Override
    public Animal addPet(Animal animal) {
        Animal ani= repo.save(animal);
        return ani;
    }

    @Override
    public List<Animal> findAllAnimal() {
        List<Animal>anim = repo.findAll();
        return anim;
    }

    @Override
    public Animal findYourAnimal(int id) throws AnimalNotFoundException {
        Optional<Animal> animal = repo.findById(id);
        if (!animal.isPresent()){
            throw new AnimalNotFoundException("animal is not available");
        }
        return animal.get();


    }

    @Override
    public Animal findByName(String animal) throws AnimalNotFoundException {
        Optional<Animal> animal1= repo.findByanimal(animal);
        if (!animal1.isPresent()){
            throw new AnimalNotFoundException("hey this animal is not in our list");
        }
        return animal1.get();

    }
}
