package com.example.springtraining2.service;

import com.example.springtraining2.dto.DepartmentRequestDto;
import com.example.springtraining2.dto.DepartmentResponseDto;
import com.example.springtraining2.entity.Department;

public interface DepartmentService {
    DepartmentResponseDto createDepartment(DepartmentRequestDto departmentRequestDto);

    Department getDepartmentById(Long id);


    DepartmentResponseDto updateDepartment(Long departmentId, DepartmentRequestDto departmentRequestDto);
}
