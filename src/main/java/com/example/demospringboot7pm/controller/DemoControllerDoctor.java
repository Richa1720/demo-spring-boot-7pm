package com.example.demospringboot7pm.controller;

import com.example.demospringboot7pm.model.Doctor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DemoControllerDoctor {
    @RequestMapping("/doctor")
    public Doctor getDoctor() {
        Doctor obj = new Doctor("Aseem Agarwal", 1200, "eye surgeon");
        return obj;
    }

    @RequestMapping("/doctor_array_list")
    public ArrayList<Doctor> doctorArrayList() {
        //SYNTAX : Collection <DATATYPE> objName= new Collection();

        ArrayList<Doctor> doclist = new ArrayList<>();

        Doctor doctor1 = new Doctor("M.K Singh", 600, "neuro physician");
        Doctor doctor2 = new Doctor("Shailendra jain", 500, "dermatologist");
        Doctor doctor3 = new Doctor("Surbhi Gupta", 600, "dermatologist");
        Doctor doctor4 = new Doctor("Sandeep Gupta", 1800, "ENT surgeon");

        doclist.add(doctor1);
        doclist.add(doctor2);
        doclist.add(doctor3);
        doclist.add(doctor4);

        return doclist;
    }

    @RequestMapping("/doctor_first_list")
    public Doctor doctorFirstList() {
        //SYNTAX : Collection <DATATYPE> objName= new Collection();

        ArrayList<Doctor> doclist = new ArrayList<>();

        Doctor doctor1 = new Doctor("M.K Singh", 600, "neuro physician");
        Doctor doctor2 = new Doctor("Shailendra jain", 500, "dermatologist");
        Doctor doctor3 = new Doctor("Surbhi Gupta", 600, "dermatologist");
        Doctor doctor4 = new Doctor("Sandeep Gupta", 1800, "ENT surgeon");

        doclist.add(doctor1);
        doclist.add(doctor2);
        doclist.add(doctor3);
        doclist.add(doctor4);

        return doclist.get(0);


    }
}
