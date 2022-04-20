package com.bezkoder.springjwt.controllers;


import com.bezkoder.springjwt.models.medicalActs;
import com.bezkoder.springjwt.service.medicalActService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/medicalAct")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class medicalActController {
    @Autowired
    private medicalActService service;
    @PostMapping(value="/add")
    public medicalActs addMact(@RequestBody medicalActs ma){
        return service.saveMedicalAct(ma);
    }
    @RequestMapping(method = RequestMethod.GET, path = "/GetAll")
    public List<medicalActs> getAll(){
        return service.getMedicalAct();
    }


    @RequestMapping(value = "/GetBy/{id}", //
            method = RequestMethod.GET)
    @ResponseBody
    public Optional<medicalActs> getMact(@PathVariable("id") Long id) {
        return service.getMedicalAct(id);
    }



    @RequestMapping(path = "/update",
            method = RequestMethod.PUT)
    @ResponseBody
    public medicalActs updateMact(@RequestBody medicalActs pres) {
        return service.UpdateMedicalAct(pres);
    }
    @RequestMapping(value = "/delete/{id}", //
            method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteMact(@PathVariable("id") Long id) {

        service.DeleteMedicalAct(id);
    }

}
