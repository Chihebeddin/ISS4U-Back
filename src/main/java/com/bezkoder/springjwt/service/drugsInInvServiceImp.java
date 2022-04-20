package com.bezkoder.springjwt.service;


import com.bezkoder.springjwt.models.PrscrptnDta;
import com.bezkoder.springjwt.repository.drugsInInventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class drugsInInvServiceImp implements drugsInInventoryService {
    @Autowired
    private drugsInInventoryRepo repo;
    @Override
    public PrscrptnDta saveDrugInv(PrscrptnDta di) {
        return repo.save(di);
    }

    @Override
    public List<PrscrptnDta> getDrugInv() {
        return repo.findAll();
    }

    @Override
    public Optional<PrscrptnDta> getDrugInvById(Long id) {
        return repo.findById(id);
    }

    @Override
    public PrscrptnDta UpdateDrugInv(PrscrptnDta di) {
        return repo.save(di);
    }

    @Override
    public Long DeleteDrugInv(Long id) {
         repo.deleteById(id);
        return id;
    }
}
