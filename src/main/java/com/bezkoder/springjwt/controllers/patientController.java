package com.bezkoder.springjwt.controllers;



import com.bezkoder.springjwt.models.patient;
import com.bezkoder.springjwt.service.patientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/patient")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class patientController {
    @Autowired
    private patientService service;
    @RequestMapping(value = "/GetAll", //
            method = RequestMethod.GET)
    @ResponseBody
    public List<patient> getpPatients() {

        return service.getPatients();
    }
    @RequestMapping(value = "/GetBy/{id}", //
            method = RequestMethod.GET)
    @ResponseBody
    public Optional<patient> getPatient(@PathVariable("id") Long id) {
        return service.getPatient(id);
    }
    @RequestMapping(value = "/add", //
            method = RequestMethod.POST)
    @ResponseBody
    public patient addPatient(@RequestBody patient pt) {

        return service.savePatient(pt);
    }
    @RequestMapping(path = "/update",
            method = RequestMethod.PUT)
    @ResponseBody
    public patient updatePatient(@RequestBody patient pt) {
        return service.UpdatePatient(pt);
    }
    @RequestMapping(value = "/delete/{id}", //
            method = RequestMethod.DELETE)
    @ResponseBody
    public void deletePatient(@PathVariable("id") Long id) {

        service.DeletePatient(id);
    }

}
