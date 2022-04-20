package com.bezkoder.springjwt.controllers;


import com.bezkoder.springjwt.models.PrscrptnDta;
import com.bezkoder.springjwt.service.drugsInInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/drugInv")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class drugsInInvController {
    @Autowired
    private drugsInInventoryService service;
    @PostMapping(value="/add")
    public PrscrptnDta addInv(@RequestBody PrscrptnDta di){
        return service.saveDrugInv(di);
    }
    @RequestMapping(method = RequestMethod.GET, path = "/GetAll")
    public List<PrscrptnDta> getAll(){
        return service.getDrugInv();
    }


    @RequestMapping(value = "/GetBy/{id}", //
            method = RequestMethod.GET)
    @ResponseBody
    public Optional<PrscrptnDta> getDrugInv(@PathVariable("id") Long id) {
        return service.getDrugInvById(id);
    }



    @RequestMapping(path = "/update",
            method = RequestMethod.PUT)
    @ResponseBody
    public PrscrptnDta updatedrugDrugInventory(@RequestBody PrscrptnDta di) {
        return service.UpdateDrugInv(di);
    }
    @RequestMapping(value = "/delete/{id}", //
            method = RequestMethod.DELETE)
    @ResponseBody
    public void deletedrugInv(@PathVariable("id") Long id) {

        service.DeleteDrugInv(id);
    }
}
