package com.example.springtraining2.dto;


import com.example.springtraining2.entity.Department;

public class EmployeeResponseDto {
    private Long id;
    private String name;
    private String code;
    private DepartmentResponseDto department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DepartmentResponseDto getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentResponseDto department) {
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDepartmentFromEntity(Department departmentEntity){
        DepartmentResponseDto departmentResponseDto=new DepartmentResponseDto();
        departmentResponseDto.setId(departmentEntity.getId());
        departmentResponseDto.setName((departmentEntity.getName()));
        this.department=departmentResponseDto;
    }
}
