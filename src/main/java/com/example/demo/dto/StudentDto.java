package com.example.demo.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class StudentDto {
    private Long id;

    private String name;

    private Integer age;

    @NonNull
    private String email;

}
