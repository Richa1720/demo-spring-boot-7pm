// For understanding the working of END points

package com.example.demospringboot7pm.controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //to create method :  access_spec  return_type method_name() {CODE}

    @RequestMapping("/hello")     //  this annotation is for calling endpoints
    public void hello()
    {
        System.out.println(" Welcome to spring boot .......");
    }

    @RequestMapping("/Welcome")
    public void welcome()                 //  without return, for console o/p
    {
        System.out.println("Welcome to Spring Boot .........");
    }



    @RequestMapping("/age")          //return_type for browser o/p
    public int age()
    {
        int varsha=27;
        return varsha;
    }
    @RequestMapping("/name")
    public String name(String var)
    {
        var="String var as a parameter inside method name ......";   // experiment
        System.out.println("var : "+var);
        String name="Varsha Thakur";
       // System.out.println("Richa Rajawat...."+name);      it is Varsha trial testing

        return name;
    }
    @RequestMapping("/salary")
    public double salary()
    {
        double salary=50000.00;
        return salary;
    }

    @RequestMapping("/char")
    public char startingLetter()
    {
        char sl='V';
        System.out.println(" My starting letter is : "+sl);
        return sl;

    }
}
