package com.bezkoder.springjwt.controllers;


import com.bezkoder.springjwt.models.Mact;
import com.bezkoder.springjwt.service.MactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/Mact")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class MactController {
    @Autowired
    private MactService service;
    @GetMapping(value= "/GetMactName/{keyword}")
    public List<String> afficherName(@PathVariable("keyword") String keyword){return service.findByname(keyword);}
    @GetMapping(value= "/macbyName/{keyword}")
    public List<Mact> macbyName(@PathVariable("keyword") String keyword){return service.findbyName(keyword);}
    @RequestMapping(method = RequestMethod.GET, path = "/GetAll")
    public List<Mact> getAll(){
        return service.getMacts();
    }
}
