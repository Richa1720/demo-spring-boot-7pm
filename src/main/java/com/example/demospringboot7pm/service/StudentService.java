package com.example.demospringboot7pm.service;

import com.example.demospringboot7pm.model.Employee;
import com.example.demospringboot7pm.model.Student;
import com.example.demospringboot7pm.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;
    public String add(Student student)
    {
        //return "success";
         repository.save(student);                  //this  insert student in database table of student
         return "Student added successfully to DB ";
    }

        public List<Student> getAllStudent()
        {
            return  repository.findAll();  //get all the data from student table
        }

          //update
         public String updateStudent(long id,String name,String section,int age)
         {
             //1 find out record

             Student student= repository.getById(id);
             //2 update the value and save to the database
             student.setName(name);
             student.setSection(section);
             student.setAge(age);
             repository.save(student);

             return "Successfully updated student to DB = "+name +"section = "+section ;

         }

         //Delete

    public String delStudent(long id)
    {
        repository.deleteById(id);
        return "Successfully deleted student form DB";
    }

    //created method by own


    public Student findByName(String name)
    {
        return repository.findByName(name);

    }

    //dev method

    public Student findByAge(int age)
    {
        return repository.findByAge(age);
    }
}
