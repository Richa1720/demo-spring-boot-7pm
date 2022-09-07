package com.example.demospringboot7pm.controller;

import com.example.demospringboot7pm.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DemoController2 {

    @RequestMapping("/hello_spring")
    public String hello()
    {
        String hello="Hello , welcome to spring boot ....";
        System.out.println("Hello , welcome to spring boot ....");
        return hello;
    }

    // creating list
    @RequestMapping("/courses")
    public ArrayList<String> getcourse()
    {
        ArrayList<String> course = new ArrayList<>();
        course.add("java");
        course.add("springboot");
        course.add("python");
        course.add("C#");

        return course;
    }
    @RequestMapping("/student")
    public Student getstudent()
    {
        Student obj=new Student("Rose",21,"CS");

        return obj;


    }

}
