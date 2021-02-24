package com.example.springtraining2.dto;



public class EmployeeRequestDto {
    private Long id;
    private String name;
    private String code;
    private DepartmentRequestDto department;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DepartmentRequestDto getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentRequestDto department) {
        this.department = department;
    }
}
