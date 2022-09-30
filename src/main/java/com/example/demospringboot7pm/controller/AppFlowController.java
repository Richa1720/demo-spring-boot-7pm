// BASING AUTOWIRING
package com.example.demospringboot7pm.controller;

import com.example.demospringboot7pm.service.AppFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppFlowController {

    //initially creating a method returning string statement

   //here this is spring method of creating obj of another class

    @Autowired
    AppFlowService service;
    @RequestMapping("/app_flow")
    public String appFlow()
    {
        //this is normal java method of creating obj of another class to get its method but here we will use spring method

        /*AppFlowService obj=new AppFlowService();
        obj.appFlow();*/

        //return "Hello from appFlowController";
        return service.appFlow();
    }
}
