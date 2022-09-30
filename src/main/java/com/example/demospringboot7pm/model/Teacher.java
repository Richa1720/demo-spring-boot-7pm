package com.example.demospringboot7pm.model;

public class Teacher {


    String name;
    int salary;
    String sub;

  //CONSTRUCTOR

    public Teacher(String name, int salary, String sub) {
        this.name = name;
        this.salary = salary;
        this.sub = sub;
    }

    //GETTER AND SETTER


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }
}
