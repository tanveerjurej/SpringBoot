package com.practice.exceptionhandling.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

     @NotBlank(message = "how could you find Animal without knowing which animal you finding")
     private String animal;

    @NotBlank(message = "just give the animal colour. It will make it easy to find")
     private String color;




}
