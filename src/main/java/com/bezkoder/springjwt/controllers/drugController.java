package com.bezkoder.springjwt.controllers;


import com.bezkoder.springjwt.models.drug;
import com.bezkoder.springjwt.service.drugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drug")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class drugController {
    @Autowired
    private drugService service;
    @GetMapping(value= "/GetName/{keyword}")
    public List<String> afficherName(@PathVariable("keyword") String keyword){return service.findByname(keyword);}
    @GetMapping(value= "/GetDrug/{keyword}")
    public List<drug> getDrug(@PathVariable("keyword") String keyword){return service.findDrug(keyword);}
}
