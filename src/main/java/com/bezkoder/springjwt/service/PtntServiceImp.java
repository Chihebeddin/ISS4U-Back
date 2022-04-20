package com.bezkoder.springjwt.service;



import com.bezkoder.springjwt.models.Ptnt;
import com.bezkoder.springjwt.repository.PtntRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PtntServiceImp implements PtntService {
    @Autowired
    private PtntRepo repo;
    @Override
    public Ptnt SavePtnt(Ptnt ptnt) {
        return repo.save(ptnt);
    }

    @Override
    public List<Ptnt> getPatients() {
        return repo.findAll();
    }

    @Override
    public Ptnt UpdatePatient(Ptnt pt) {
        return repo.save(pt);
    }

//    @Override
//    public List<Ptnt> getValidpatients() {
//        return repo.ValidPatient();
//    }


}
