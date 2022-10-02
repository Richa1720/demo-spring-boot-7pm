package com.example.demospringboot7pm.repository;

import com.example.demospringboot7pm.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
   public Student findByName(String name);  //this method is not included in spring jpa reposiotoy ,it's self made method

   public Student findByAge(int age);    //method created by dev
}
