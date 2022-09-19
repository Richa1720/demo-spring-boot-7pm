//TO UNDERSTAND HOW CRUD OPERATION WORKS IN STUDENT OBJECT

package com.example.demospringboot7pm.controller;

import com.example.demospringboot7pm.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StudentController {

    //CRUD operation

    ArrayList <Student> studentArrayList=new ArrayList<>();

    //Trying JSON object

    //now we are restricting POSTMAN Methods now in the code

    @RequestMapping(value="/add_std", method =RequestMethod.POST)
    public String add_student(@RequestBody Student student)
    {
        studentArrayList.add(student);

        return "Successfully added student into list using request body ";
    }



    //C  Create / Add   End point

    @RequestMapping("/student_added/{name}/{age}/{dept}")
    public String add(@PathVariable String name,@PathVariable int age,@PathVariable String dept)
    {
        //CREATE OBJECT OF STUDENT

        Student student = new Student(name,age,dept);
        studentArrayList.add(student);
        return "Student data added successfully ...";
    }

    //R- READ / GET
    @RequestMapping(value="/students",method=RequestMethod.GET)
    public ArrayList<Student> getStudentArrayList()
    {
        return studentArrayList;
    }

    //U Update
    @RequestMapping(value="/update_name",method=RequestMethod.PUT)
    public String updateName(@RequestParam String name,@RequestParam int index)
    {
        Student student = studentArrayList.get(index);
        student.setName(name);

        return "successfully updated name ";
    }

    //D delete

    @RequestMapping(value="/delete_student",method=RequestMethod.DELETE)
    public String delete(@RequestParam int index)
    {
        studentArrayList.remove(index);

        return "Successfully removed student at given index .....";
    }


}
