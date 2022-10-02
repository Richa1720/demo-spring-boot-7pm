package com.example.demospringboot7pm.controller;

import com.example.demospringboot7pm.model.Employee;
import com.example.demospringboot7pm.model.Student;
import com.example.demospringboot7pm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeDBController {

    //C FOR CREATE/ADD
    @Autowired
    EmployeeService service;
    @PostMapping("/add_emp")
    public String addEmp(@RequestBody Employee employee)
    {
       // return "Successfully added student to EmployeeDBController using requestBody ";
        return service.add(employee);
    }

    //R FOR READ / GET
    @GetMapping("/get_employee_db")
    public List<Employee> getEmployeesArrayList()
    {
        return service.getAllEmployee();
    }

    //U UPDATE /PUT

    @PutMapping("/update_employee_db")
    public String updateEmployeedb(@RequestParam long id,@RequestParam String name,@RequestParam String dept)
    {
       return service.updateEmployeeDB(id,name,dept);
    }

    //DELETE
    @DeleteMapping("/delete_employee_db")
    public String deleteEmployeeDB(@RequestParam long id)
    {
        return service.deleteEmp(id);
    }

    //dev created method
    @GetMapping("/findbyname_employee")
    public Employee student(@RequestParam String name)
    {
        return service.findByName(name);
    }


}
