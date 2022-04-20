package com.bezkoder.springjwt.service;

import com.bezkoder.springjwt.models.drug;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface drugService {
    List<String> findByname(String keyword);
    List<drug> findDrug(String keyword);

}
