package com.example.springtraining2.repository;

import com.example.springtraining2.entity.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department,Long> {
}
