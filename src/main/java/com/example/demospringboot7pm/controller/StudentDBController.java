package com.example.demospringboot7pm.controller;

import com.example.demospringboot7pm.service.StudentService;
import com.example.demospringboot7pm.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentDBController {

    @Autowired
    StudentService service;       //here this is spring method of creating obj of another class

    // CRUD C create /add   -POST
    @PostMapping ("/crud_add_stud")
    public String crudAddStud(@RequestBody Student student)
    {
      // return "Successfully added student using RequestBody ";
        return service.add(student);

    }

    //READ  /GET
    @GetMapping("/crud_get_stud")
    public List<Student> getStudentArrayList()
    {
        return service.getAllStudent();
    }

    //UPDATE /PUT
    @PutMapping("/update_stu_db")
    public String updateStuDB(@RequestParam long id,@RequestParam String name,@RequestParam String section,@RequestParam int age)
    {
        return service.updateStudent(id,name,section,age);
    }

    //D for DELETE
    @DeleteMapping("/delete_stud_db")
    public String deleteStud(@RequestParam long id)
    {
        return service.delStudent(id);
    }

    //self made method
    @GetMapping("/find_by_name")
    public Student student(@RequestParam String name)
    {
        return service.findByName(name);
    }
    @GetMapping("/find_by_age")
  //  public Student studentAge(int age)      //here I haven't used @RequestParam annotation still it's working the same as I have applied
    public Student studentAge(@RequestParam int age)
    {
        return service.findByAge(age);
    }

}
