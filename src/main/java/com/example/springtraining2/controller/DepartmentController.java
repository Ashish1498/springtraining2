package com.example.springtraining2.controller;


import com.example.springtraining2.dto.DepartmentRequestDto;
import com.example.springtraining2.dto.DepartmentResponseDto;
import com.example.springtraining2.dto.EmployeeResponseDto;
import com.example.springtraining2.entity.Department;
import com.example.springtraining2.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public DepartmentResponseDto createDepartment(@RequestBody DepartmentRequestDto departmentRequestDto){
        return departmentService.createDepartment(departmentRequestDto);
    }
    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") Long id){
        return departmentService.getDepartmentById(id);
    }

    @PutMapping("/{id}")
    public DepartmentResponseDto updateDepartment(@PathVariable("id") Long departmentId,@RequestBody DepartmentRequestDto departmentRequestDto){
        return departmentService.updateDepartment(departmentId,departmentRequestDto);
    }



}
