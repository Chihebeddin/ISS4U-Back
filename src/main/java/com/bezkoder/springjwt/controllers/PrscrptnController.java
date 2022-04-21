package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.models.Prscrptn;
import com.bezkoder.springjwt.models.examSchdld;
import com.bezkoder.springjwt.service.PrscrptnService;
import com.bezkoder.springjwt.service.examSchdldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/prescription")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class PrscrptnController {
    @Autowired
    private PrscrptnService service;
    @Autowired
    private examSchdldService eservice;



    @PostMapping(value="/add")
    public Prscrptn addPrescription(@RequestBody Prscrptn pres){
        return service.savePrescription(pres);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/GetAll")
    public List<Prscrptn> getAll(){
        return service.getPrescriptions();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/GetAllExams")
    public List<examSchdld> getAllExams(){
        return eservice.getExams();
    }

    @RequestMapping(value = "/GetBy/{id}",method = RequestMethod.GET)
     @ResponseBody     public Optional<Prscrptn> getPrescription(@PathVariable("id") Long id) {
     return service.getPrescription(id);     }

    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    @ResponseBody
    public Prscrptn updatePrescription(@RequestBody Prscrptn pres) {
        return service.UpdatePrescription(pres);     }

    @RequestMapping(path = "/updateExam", method = RequestMethod.PUT)
    @ResponseBody
    public examSchdld updateExam(@RequestBody examSchdld exam) {
        return eservice.UpdateExam(exam);     }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deletePrescription(@PathVariable("id") Long id) {
        service.DeletePrescription(id);     }
}
