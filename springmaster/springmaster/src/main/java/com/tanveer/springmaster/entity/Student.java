package com.tanveer.springmaster.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
        uniqueConstraints = @UniqueConstraint(
                name = "email_unique",
                columnNames = "email"
        )
)

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int studentId;

    String firstName;
    String lastName;

    String studentEmail;

    @Embedded
    private Guardian guardian;
}
