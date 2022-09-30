//WEB SIMPLE CALCULATOR THROUGH @RequestMapping
package com.example.demospringboot7pm.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {


    @RequestMapping("/addition")
    public String addition()     //here I have used String return_type for returning String "Addition is : "+
    {
        int a=100;
        int b=50;
        int add=a+b;

        return "Addition is : "+add;
    }

    // PathVariable

    /*@RequestMapping("/Cal_add"/{a}/{b})
    public String calAdd(@PathVariable int a, @PathVariable int b)
    {
        return "Addition of two numbers is : "+(a+b);
    }*/

    // through request param   
    @RequestMapping("/add")
    public String add(@RequestParam int a,@RequestParam int b)
    {
        return "Addition is : "+(a+b);
    }


    @RequestMapping("/subtraction")
    public int subtraction()
    {
        int a=66;
        int b=33;
        int sub=a-b;

        return sub;
    }
    @RequestMapping("/multiplication")
    public int multiplication()
    {
        int a=5;
        int b=9;
        int mul=a*b;

        return mul;
    }

    @RequestMapping("/division")
    public double divide()
    {
        int a=63;
        int b=7;
        double div=(double)a/b;

        return div;
    }
}
