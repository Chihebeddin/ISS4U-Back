package com.bezkoder.springjwt.service;

import com.bezkoder.springjwt.models.Prscrptn;
import com.bezkoder.springjwt.repository.PrscrptnRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PrscrptnImp implements PrscrptnService{

    @Autowired
    private PrscrptnRepo repo;

    @Override
    public Prscrptn savePrescription(Prscrptn pres) {
        return repo.save(pres);
    }

    @Override
    public Prscrptn UpdatePrescription(Prscrptn pres) {
        return repo.save(pres);
    }

    @Override
    public Long DeletePrescription(Long id) {
        repo.deleteById(id);
        return id;
    }

    @Override
    public Optional<Prscrptn> getPrescription(Long id) {
        return repo.findById(id);
    }

    @Override
    public List<Prscrptn> getPrescriptions() {
        return repo.findAll();
    }


}
