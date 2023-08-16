package com.practicewithDto.dtoPractice.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class StudentDto {
    private long id;
    private String name;
    private String email;
    private String branch;
}
