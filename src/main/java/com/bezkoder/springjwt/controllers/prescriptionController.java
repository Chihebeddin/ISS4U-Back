package com.bezkoder.springjwt.controllers;



import com.bezkoder.springjwt.models.Prscrptn;

import com.bezkoder.springjwt.service.prescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Prscrptn")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class prescriptionController {
    @Autowired
    private prescriptionService service;
    @PostMapping(value="/add")
    public Prscrptn addPrescription(@RequestBody Prscrptn pres){
        return service.savePrescription(pres);
    }
    @RequestMapping(method = RequestMethod.GET, path = "/GetAll")
    public List<Prscrptn> getAll(){
        return service.getPrescriptions();
    }


    @RequestMapping(value = "/GetBy/{id}", //
            method = RequestMethod.GET)
    @ResponseBody
    public Optional<Prscrptn> getPrescription(@PathVariable("id") Long id) {
        return service.getPrescription(id);
    }



    @RequestMapping(path = "/update",
            method = RequestMethod.PUT)
    @ResponseBody
    public Prscrptn updatePrescription(@RequestBody Prscrptn pres) {
      return service.UpdatePrescription(pres);
    }
    @RequestMapping(value = "/delete/{id}", //
            method = RequestMethod.DELETE)
    @ResponseBody
    public void deletePrescription(@PathVariable("id") Long id) {

    service.DeletePrescription(id);
    }
    @GetMapping(value= "/GetDrugName/{keyword}")
    public List<String> GetDrugByName(@PathVariable("keyword") String keyword){return service.findDrugByname(keyword);}
    @GetMapping(value= "/GetTreatmentName/{keyword}")
    public List<String> GetTreatmentByName(@PathVariable("keyword") String keyword){
        return service.findTreatmentByname(keyword);
    }


}
