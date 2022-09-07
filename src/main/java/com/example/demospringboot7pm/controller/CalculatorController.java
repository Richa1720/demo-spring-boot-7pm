package com.example.demospringboot7pm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/addition")
    public int addition()
    {
        int a=100;
        int b=50;
        int add=a+b;

        return add;
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
    public int divide()
    {
        int a=63;
        int b=7;
        int div=a/b;

        return div;
    }
}
