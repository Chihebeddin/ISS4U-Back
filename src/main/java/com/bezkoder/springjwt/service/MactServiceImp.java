package com.bezkoder.springjwt.service;

import com.bezkoder.springjwt.models.Mact;
import com.bezkoder.springjwt.repository.MactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MactServiceImp implements MactService {
    @Autowired
    private MactRepo repo;
    @Override
    public List<String> findByname(String keyword) {
        return repo.findName(keyword);
    }

    @Override
    public List<Mact> findbyName(String keyword) {
        return repo.findbyName(keyword);
    }

    @Override
    public List<Mact> getMacts() {
        return repo.findAll();
    }


}
