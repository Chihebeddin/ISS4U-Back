package com.bezkoder.springjwt.service;

import com.bezkoder.springjwt.models.Mact;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MactService {
    List<String> findByname(String keyword);
    List<Mact> findbyName(String keyword);
    List<Mact> getMacts();

}
