package com.example.springtraining2.service.impl;

import com.example.springtraining2.dto.DepartmentRequestDto;
import com.example.springtraining2.dto.DepartmentResponseDto;
import com.example.springtraining2.dto.EmployeeResponseDto;
import com.example.springtraining2.entity.Department;
import com.example.springtraining2.entity.Employee;
import com.example.springtraining2.repository.DepartmentRepository;
import com.example.springtraining2.service.DepartmentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentResponseDto createDepartment(DepartmentRequestDto departmentRequestDto) {

        Department department=new Department();
        BeanUtils.copyProperties(departmentRequestDto,department);
        Department savedDepartment=departmentRepository.save(department);
        DepartmentResponseDto responseDto=new DepartmentResponseDto();
        BeanUtils.copyProperties(savedDepartment,responseDto);
        return responseDto;


    }
}
