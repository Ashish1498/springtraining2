package com.example.springtraining2.service;

import com.example.springtraining2.dto.EmployeeRequestDto;
import com.example.springtraining2.dto.EmployeeResponseDto;
import org.springframework.stereotype.Service;


public interface EmployeeService {
    EmployeeResponseDto createEmployee(EmployeeRequestDto employeeRequestDto);

    EmployeeResponseDto getEmployeeById(Long id);

    EmployeeResponseDto updateEmployeeById(Long id,EmployeeRequestDto employeeRequestDto);

    EmployeeResponseDto deleteEmployeeById(Long id);
}
