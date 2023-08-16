package com.example.crudpractice.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.Properties;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "practice")
public class PracticeModel {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String name;

    private String village;


}
