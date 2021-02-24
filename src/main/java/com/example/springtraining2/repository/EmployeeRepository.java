package com.example.springtraining2.repository;

import com.example.springtraining2.entity.Department;
import com.example.springtraining2.entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {
    // by method name
    List<Employee> findByDepartment(Department department);

    List<Employee> findByDepartment_Id(Long departmentId);

    //by @query annotation
    @Query("SELECT e FROM Employee e WHERE e.department.id=?1")
    List<Employee> getEmployeeListByDepartmentId(Long departmentId);



    //by native query
    @Query(value = "SELECT * FROM employee e WHERE e.department_id=?1",nativeQuery = true)
    List<Employee> getEmployeeListByNativeQuery(Long departmentId);
}
