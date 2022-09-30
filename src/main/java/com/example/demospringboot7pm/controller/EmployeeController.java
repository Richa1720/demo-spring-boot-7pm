//TO UNDERSTAND WORKING OF CRUD OPERATION IN EMPLOYEE OBJECT

package com.example.demospringboot7pm.controller;

import com.example.demospringboot7pm.model.Employee;
import com.example.demospringboot7pm.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeController {

    ArrayList<Employee> employeesArrayList=new ArrayList<>();


    //C for CREATE /ADD   End point
    @RequestMapping("/add/{name}/{salary}/{dept}")
    public String add(@PathVariable String name,@PathVariable Double salary,@PathVariable String dept)
    {
        //CREATE OBJECT OF EMPLOYEE
        Employee employee=new Employee(name,salary,dept);
        employeesArrayList.add(employee);
        return "employee added successfully";
    }


    //R- for  READ / GET
    @RequestMapping("/employees")
    public ArrayList<Employee> getEmployeesArrayList()
    {
        return employeesArrayList;
    }

    // U for UPDATE
    @RequestMapping("/update_name_employee")
    public String updateEmployee(@RequestParam String name,@RequestParam int index)
    {
        Employee employee=employeesArrayList.get(index);
        employee.setName(name);
        return "Successfully Updated name ";
    }

    //D for delete
    @RequestMapping("/delete_employee")
    public String deleteEmployee(@RequestParam int index )
    {
        employeesArrayList.remove(index);

        return "Successfully removed employee at given index....";
    }

}

