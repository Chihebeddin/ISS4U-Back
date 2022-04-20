package com.bezkoder.springjwt.service;

import com.bezkoder.springjwt.models.drug;
import com.bezkoder.springjwt.repository.drugRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class drugServiceImp implements drugService{
    @Autowired
    private drugRepo repo;
    @Override
    public List<String> findByname(String keyword) {
        return repo.findName(keyword);
    }

    @Override
    public List<drug> findDrug(String keyword) {
        return repo.findDrug(keyword);
    }
}
