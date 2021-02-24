package com.example.springtraining2.service;

import com.example.springtraining2.dto.DepartmentRequestDto;
import com.example.springtraining2.dto.DepartmentResponseDto;

public interface DepartmentService {
    DepartmentResponseDto createDepartment(DepartmentRequestDto departmentRequestDto);
}
