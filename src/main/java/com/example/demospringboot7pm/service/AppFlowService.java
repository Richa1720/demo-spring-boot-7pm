package com.example.demospringboot7pm.service;

import com.example.demospringboot7pm.repository.AppFlowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppFlowService {

    @Autowired
    AppFlowRepository repo;
    //create simple appFlow() method nd return string statement as o/p
    public String appFlow()
    {

       // return "Hello from AppFlowService  ";
        return repo.appFlowRepo();
    }
}
