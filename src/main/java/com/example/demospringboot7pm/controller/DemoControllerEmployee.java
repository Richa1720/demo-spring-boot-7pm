// ArrayList program of creating list of employee

package com.example.demospringboot7pm.controller;

import com.example.demospringboot7pm.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DemoControllerEmployee {

    @RequestMapping("/employee")
    public Employee getEmployee()
    {
        Employee obj=new Employee("Rekha Parmar",50000.00,"Management");

        return obj;
    }
    @RequestMapping("/get_list_employee")
    public ArrayList<Employee> employeeList()     // when u want list of employee as o/p then this is the return_type presentation
    {
        //SYNTAX : Collection <DATATYPE> objName= new Collection();

        ArrayList <Employee> list=new ArrayList<>();

       // Employee obj1=new Employee(name,salary,dept);
        Employee  Employee1=new Employee("Robert",56000.0,"EC");  //we can have same data in aRRAYlist it will print as it is
        Employee  Employee2=new Employee("Robert",56000.0,"EC");
        Employee  Employee3=new Employee("Styles",45000.0,"AI");
        Employee  Employee4=new Employee("Howard",78000.00,"CSE");


        list.add( Employee1);
        list.add( Employee2);
        list.add( Employee3);
        list.add( Employee4);

        return list;
    }
    @RequestMapping("/get_first_employee")
    public Employee getFirstEmployee()
    {

        //SYNTAX : Collection <DATATYPE> objName= new Collection();

        ArrayList <Employee> employee=new ArrayList<>();

        // Employee obj1=new Employee(name,salary,dept);
        Employee  Employee1=new Employee("Robert",56000.0,"EC");  //we can have same data in aRRAYlist it will print as it is
        Employee  Employee2=new Employee("Robert",56000.0,"EC");
        Employee  Employee3=new Employee("Styles",45000.0,"AI");
        Employee  Employee4=new Employee("Howard",78000.00,"CSE");


        employee.add( Employee1);
        employee.add( Employee2);
        employee.add( Employee3);
        employee.add( Employee4);

        return employee.get(0);
    }

}
