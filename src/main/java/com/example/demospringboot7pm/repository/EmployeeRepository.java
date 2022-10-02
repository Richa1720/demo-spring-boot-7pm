package com.example.demospringboot7pm.repository;

import com.example.demospringboot7pm.model.Employee;
import com.example.demospringboot7pm.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    public Employee findByName(String name);

}
