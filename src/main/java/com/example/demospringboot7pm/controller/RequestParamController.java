package com.example.demospringboot7pm.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {
    @RequestMapping("/welcome")
    public String print(@RequestParam String name)
    {
        return "Welcome to Varsha's Programming : "+name;
    }

    @RequestMapping("/skills")
    public String skills(@RequestParam String name, @RequestParam String skill)
    {
        return "This person "+name +" has "+skill;
    }

    // making sub method using PathVariable

    @RequestMapping("/subtraction/{a}/{b}")
    public String sub( @PathVariable int a , @PathVariable int b)
    {
        return "Subtraction is : "+(a-b);
    }


    //Addition with @RequestParam

    @RequestMapping("/calculate_addition")
    public String add(@RequestParam int a,@RequestParam int b)
    {
        return "Addition is : "+ (a+b);
    }

}
