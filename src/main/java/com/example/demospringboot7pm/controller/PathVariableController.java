// Sending input parameter with using @PathVariable ....

package com.example.demospringboot7pm.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {

 // Syntax :  "/endpoint/{varName}"
    @RequestMapping("/msg/{name}")
    public String message(@PathVariable String name)
    {
        return "Welcome to Spring boot ......."+name;
    }

    //SYNTAX :  "/endpoint/{varName1}/{varName2}"

    @RequestMapping("vote/{name}/{age}")
    public String eligibility(@PathVariable String name,@PathVariable int age)
    {
        if(age>18)
        {
            return name +"  Eligible for voting ...";
        }
        else
        {
            return name + "  Not Eligible for voting... ";
        }
    }
    @RequestMapping("/make_square/{num}")

    public String square(@PathVariable int num)
    {
        return "Square is : "+ (num*num);
    }

    @RequestMapping("/make_cube/{number}")

    public String cube(@PathVariable int number)
    {
        return "Cube is : "+(number*number*number);
    }

    @RequestMapping("/even_odd/{num}")
    public String evenOdd(@PathVariable int num)
    {
        if(num%2==0)
        {
            return num + " is EVEN";
        }
        else
        {
            return num + " is ODD";
        }
    }



}
