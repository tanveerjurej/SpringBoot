package com.practice.exceptionhandling.controller;


import com.practice.exceptionhandling.error.AnimalNotFoundException;
import com.practice.exceptionhandling.model.Animal;
import com.practice.exceptionhandling.service.ServiceInterface;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
// mujhe bhi  padhao yrr String
@RestController
@RequestMapping("/animal")
public class AnimalController {


    @Autowired
    private ServiceInterface serviceInterface;

    @PostMapping("/add")
    public Animal addAnimal(@Valid @RequestBody Animal animal){

        return serviceInterface.addPet(animal);

    }

    @GetMapping("/getAll")
    public List<Animal> getAnimal(){
       return serviceInterface.findAllAnimal();
    }

    @GetMapping("/get/{id}")
    public Animal findAnimal(@PathVariable int id) throws AnimalNotFoundException {
        return serviceInterface.findYourAnimal(id);

    }

    @GetMapping("/getAnimal/{animal}")
    public Animal findAnimalByName(@PathVariable String animal) throws AnimalNotFoundException {
        return serviceInterface.findByName(animal);
    }
}
