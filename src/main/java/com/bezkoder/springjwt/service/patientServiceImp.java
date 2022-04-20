package com.bezkoder.springjwt.service;


import com.bezkoder.springjwt.models.patient;
import com.bezkoder.springjwt.repository.patientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class patientServiceImp implements patientService{
    @Autowired
    private patientRepo repo;
    @Override
    public patient savePatient(patient pt) {
        return repo.save(pt);
    }

    @Override
    public patient UpdatePatient(patient pt) {
        return repo.save(pt);
    }

    @Override
    public Long DeletePatient(Long id) {
         repo.deleteById(id);
         return id;
    }

    @Override
    public Optional<patient> getPatient(Long id) {
        return repo.findById(id);
    }

    @Override
    public List<patient> getPatients() {
        return repo.findAll();
    }
}
