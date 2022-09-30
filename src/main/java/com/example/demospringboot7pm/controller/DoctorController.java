//TO UNDERSTAND WORKING OF CRUD OPERATION IN DOCTOR OBJECT

package com.example.demospringboot7pm.controller;

import com.example.demospringboot7pm.model.Doctor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

//RestController is used for making restful web services
// This annotation is used at the class level and allows the class to handle the requests made by the client.
@RestController
public class DoctorController {

    ArrayList <Doctor> doctorArrayList=new ArrayList<>();


    //C FOR CREATE/ADD
    @RequestMapping("/add_doctor/{name}/{fees}/{spec}")
    public String addDoctor(@PathVariable String name,@PathVariable double fees,@PathVariable String spec)
    {
        //Create object of doctor
        Doctor doctor=new Doctor(name,fees,spec);
        doctorArrayList.add(doctor);
        return "Successfully added doctor data ";
    }

    //R for READ /GET
    @RequestMapping("/get_doctor")
    public ArrayList<Doctor> getDoctorArrayList()
    {
        return doctorArrayList;
    }

    //U FOR UPDATE
    @RequestMapping("/update_doctor_name")
    public String updateDoctor(@RequestParam String spec,@RequestParam int index)
    {
        Doctor doctor=doctorArrayList.get(index);
        doctor.setSpec(spec);

        return "Successfully updated name .....";
    }

    //D FOR DELETE
    @RequestMapping("/delete_doctor")
    public String deleteDoctor(@RequestParam int index)
    {
        doctorArrayList.remove(index);

        return "Successfully deleted doctor";
    }
}
