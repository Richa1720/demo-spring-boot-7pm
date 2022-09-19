package com.example.demospringboot7pm.controller;

import com.example.demospringboot7pm.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DemoController2 {

    @RequestMapping("/hello_spring")
    public String hello() {
        String hello = "Hello , welcome to spring boot ....";
        System.out.println("Hello , welcome to spring boot ....");
        return hello;
    }

    // creating list
    @RequestMapping("/courses")
    public ArrayList<String> getcourse() {
        ArrayList<String> course = new ArrayList<>();
        course.add("java");
        course.add("springboot");
        course.add("python");
        course.add("C#");

        return course;
    }

    @RequestMapping("/student")
    public Student getstudent() {
        Student obj = new Student("Rose", 21, "CS");

        return obj;


    }

    @RequestMapping("/student_array_list")
    public ArrayList<Student> studentArrayList() {
        //SYNTAX : Collection <DATATYPE> objName= new Collection();

        ArrayList<Student> stdlist = new ArrayList<>();

        Student student1 = new Student("Ram", 34, "Graphics Era");
        Student student2 = new Student("Don", 24, "Aeronautic Engineering");
        Student student3 = new Student("Sanaa", 21, "Robotics");
        Student student4 = new Student("Panda", 55, "Application developer");

        stdlist.add(student1);
        stdlist.add(student2);
        stdlist.add(student3);
        stdlist.add(student4);

        return stdlist;

    }

    @RequestMapping("/student_first_list")
    public Student getFirstStudent() {
        //SYNTAX : Collection <DATATYPE> objName= new Collection();

        ArrayList<Student> stdlist = new ArrayList<>();

        Student student1 = new Student("Ram", 34, "Graphics Era");
        Student student2 = new Student("Don", 24, "Aeronautic Engineering");
        Student student3 = new Student("Sanaa", 21, "Robotics");
        Student student4 = new Student("Panda", 55, "Application developer");

        stdlist.add(student1);
        stdlist.add(student2);
        stdlist.add(student3);
        stdlist.add(student4);

        return stdlist.get(0);


    }
}
