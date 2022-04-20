package com.bezkoder.springjwt.service;


import com.bezkoder.springjwt.models.medicalActs;
import com.bezkoder.springjwt.repository.medicalActRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class medicalActServiceImp implements medicalActService {
    @Autowired
    private medicalActRepo repo;
    @Override
    public medicalActs saveMedicalAct(medicalActs ma) {
        return repo.save(ma);
    }

    @Override
    public medicalActs UpdateMedicalAct(medicalActs ma) {
        return repo.save(ma);
    }

    @Override
    public Long DeleteMedicalAct(Long id) {

                repo.deleteById(id);
        return id;
    }

    @Override
    public Optional<medicalActs> getMedicalAct(Long id) {
        return repo.findById(id);
    }

    @Override
    public List<medicalActs> getMedicalAct() {
        return repo.findAll();
    }


}
