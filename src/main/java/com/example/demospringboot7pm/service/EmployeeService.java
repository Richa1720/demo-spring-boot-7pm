package com.example.demospringboot7pm.service;

import com.example.demospringboot7pm.model.Employee;
import com.example.demospringboot7pm.model.Student;
import com.example.demospringboot7pm.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;
    public String add(Employee employee)
    {
       // return "success";
        repository.save(employee);            //insert student data in database(Employee)
        return "Successfully added employee to DB ";

    }

    public List<Employee> getAllEmployee()
    {
       return repository.findAll();         //  get all the data from table
    }

    //UPDATE

    public String updateEmployeeDB(long id,String name,String dept)
    {
        //1 find out record
        Employee employee=repository.getById(id);

        //2 update the value and save to the database
        employee.setName(name);
        employee.setDept(dept);             //updating two values simultaneously in same method
        repository.save(employee);
        return "Successfully updated name as "+name;
    }

    //D FOR DELETE

    public String deleteEmp(long id)
    {
        repository.deleteById(id);

        return "Successfully deleted employee from the database";
    }

    //dev method

    public Employee findByName(String name)
    {
        return repository.findByName(name);
    }
}
