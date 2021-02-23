package com.example.springtraining2.service.impl;

import com.example.springtraining2.dto.EmployeeRequestDto;
import com.example.springtraining2.dto.EmployeeResponseDto;
import com.example.springtraining2.entity.Employee;
import com.example.springtraining2.repository.EmployeeRepository;
import com.example.springtraining2.service.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeResponseDto createEmployee(EmployeeRequestDto employeeRequestDto) {

        Employee employee=new Employee();
        //copy fields from dto to employee
        BeanUtils.copyProperties(employeeRequestDto,employee);

        //save employee to db
        Employee savedEmployee=employeeRepository.save(employee);

        //copy from employee to dto
        EmployeeResponseDto responseDto=new EmployeeResponseDto();
        BeanUtils.copyProperties(savedEmployee,responseDto);


        return responseDto;
    }

    @Override
    public EmployeeResponseDto getEmployeeById(Long id) {
        Optional<Employee> employeeOptional=employeeRepository.findById(id);
        if(employeeOptional.isPresent()){
            //copy from employee to dto
            EmployeeResponseDto responseDto=new EmployeeResponseDto();
            BeanUtils.copyProperties(employeeOptional.get(),responseDto);
            return responseDto;
        }
     return null;
    }

    public EmployeeResponseDto updateEmployeeById(Long id,EmployeeRequestDto employeeRequestDto){
        Optional<Employee> employeeOptional=employeeRepository.findById(id);
        if(employeeOptional.isPresent()){
            Employee employeeFromDb=employeeOptional.get();
            employeeFromDb.setName(employeeRequestDto.getName());
            employeeFromDb.setDepartmentName(employeeRequestDto.getDepartmentName());

            Employee savedEmployee=employeeRepository.save(employeeFromDb);

            EmployeeResponseDto responseDto=new EmployeeResponseDto();
            BeanUtils.copyProperties(savedEmployee,responseDto);
            return responseDto;
        }
        return null;
    }
    public EmployeeResponseDto deleteEmployeeById(Long id){
        Optional<Employee> employeeOptional=employeeRepository.findById(id);

        if(employeeOptional.isPresent()){
            Employee employeeFromDb=employeeOptional.get();
            EmployeeResponseDto responseDto=new EmployeeResponseDto();
            BeanUtils.copyProperties(employeeFromDb,responseDto);
            employeeRepository.deleteById(id);
            return responseDto;
        }
        return null;
    }

}
