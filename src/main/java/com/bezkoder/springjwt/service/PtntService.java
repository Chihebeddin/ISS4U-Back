package com.bezkoder.springjwt.service;

import com.bezkoder.springjwt.models.Ptnt;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PtntService {
    Ptnt SavePtnt (Ptnt ptnt);
    List<Ptnt> getPatients();
    Ptnt UpdatePatient(Ptnt pt);
//    List<Ptnt> getValidpatients();
}
