package com.bezkoder.springjwt.controllers;



import com.bezkoder.springjwt.models.Ptnt;
import com.bezkoder.springjwt.service.PtntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ptnt")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class PtntController {
    @Autowired
    private PtntService service;
    @RequestMapping(value = "/add", //
            method = RequestMethod.POST)
    @ResponseBody
    public Ptnt addPatient(@RequestBody Ptnt pt) {

        return service.SavePtnt(pt);
    }
    @RequestMapping(value = "/GetAll", //
            method = RequestMethod.GET)
    @ResponseBody
    public List<Ptnt> getpPatients() {

        return service.getPatients();
    }
    @RequestMapping(path = "/update",
            method = RequestMethod.PUT)
    @ResponseBody
    public Ptnt updatePatient (@RequestBody Ptnt pt) {
        return service.UpdatePatient(pt);
    }
//    @RequestMapping(value = "/getValid", //
//            method = RequestMethod.GET)
//    @ResponseBody
//    public List<Ptnt> getvalidPatients() {
//
//        return service.getValidpatients();
//    }

}

