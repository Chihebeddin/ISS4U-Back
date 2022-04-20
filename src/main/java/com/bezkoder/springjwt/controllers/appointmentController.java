package com.bezkoder.springjwt.controllers;



import com.bezkoder.springjwt.models.appointment;
import com.bezkoder.springjwt.service.appointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class appointmentController {
    @Autowired
    private appointmentService appointmentservice;
    @PostMapping(value="/add")
    public appointment addAppointment(@RequestBody appointment app){

        return appointmentservice.saveAppointment(app);
    }
    @RequestMapping(method = RequestMethod.GET, path = "/GetAll")
    //@GetMapping(value="/GetAll")
    public List<appointment> getAll()
    {
        return appointmentservice.getAppoinments();
    }
}
