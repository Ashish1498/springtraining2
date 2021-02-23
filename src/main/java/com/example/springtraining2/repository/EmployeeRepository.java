package com.example.springtraining2.repository;

import com.example.springtraining2.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {
}
