package com.example.springtraining2.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeRequestDto {
    private long id;
    private String name;
    private String departmentName;
}
