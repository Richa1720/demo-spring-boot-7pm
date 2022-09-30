package com.example.demospringboot7pm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="TEST_TABLE_EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue
    long id;  //primary key of table
    String name;
    double salary;
    String dept;

    //DEFAULT CONSTRUCTOR
    public Employee() {
    }

    public Employee(String name, double salary, String dept) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
