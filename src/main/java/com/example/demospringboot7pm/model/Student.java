package com.example.demospringboot7pm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="test_student_table")  //here we are changing Table_Name
public class Student {
    @Id
    @GeneratedValue   // with this notation database automatically increment the ID +1,2,3,4..... ;
    long ID;  // primary key of table
    String name;
    int age;
    @Column(name="stream")  // with this notation we can change/rename column_name(section)
    String section;

    // create default constructor
    public Student() {
    }
    //parameterized constructor


    public Student(String name, int age, String section) {
        this.name = name;
        this.age = age;
        this.section = section;
    }

    // getter & setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
