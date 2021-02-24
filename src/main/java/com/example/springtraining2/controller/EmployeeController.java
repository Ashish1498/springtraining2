package com.example.springtraining2.controller;


import com.example.springtraining2.dto.EmployeeRequestDto;
import com.example.springtraining2.dto.EmployeeResponseDto;
import com.example.springtraining2.entity.Employee;
import com.example.springtraining2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public EmployeeResponseDto createEmployee(@RequestBody EmployeeRequestDto employeeRequestDto){
        return employeeService.createEmployee(employeeRequestDto);
    }

    @GetMapping("/{id}")
    public EmployeeResponseDto getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/{id}")
    public EmployeeResponseDto updateEmployeeById(@PathVariable("id") Long id,@RequestBody EmployeeRequestDto employeeRequestDto){
        return employeeService.updateEmployeeById(id,employeeRequestDto);
    }

    @DeleteMapping("/{id}")
    public EmployeeResponseDto deleteEmployeeById(@PathVariable("id") Long id){
        return employeeService.deleteEmployeeById(id);
    }

    @GetMapping("/department/{id}")
    public List<EmployeeResponseDto> getEmployeeListByDepartment(@PathVariable("id") Long departmentId){
        return employeeService.getEmployeeListByDepartment(departmentId);

    }


}
