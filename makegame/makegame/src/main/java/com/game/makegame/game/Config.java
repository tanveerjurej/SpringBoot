package com.game.makegame.game;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Address(String City, String villsge){}

record Person(String name, int age, Address adress){}
@Configuration
public class Config {

    @Bean
    public String name(){
        return "tanveer";
    }
    @Bean
   public int age(){
        return 15;
   }

    @Bean
    public Address adress(){
        var data = new Address("lucknow", "hussainabd");
        return data;
    }


    @Bean
    public Person person2(){
        return new Person(name(),age(), adress());
    }




    }

