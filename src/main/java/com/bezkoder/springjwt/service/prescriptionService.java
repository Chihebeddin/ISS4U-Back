package com.bezkoder.springjwt.service;

import com.bezkoder.springjwt.models.Prscrptn;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface prescriptionService {
    Prscrptn savePrescription (Prscrptn pres);
    Prscrptn UpdatePrescription (Prscrptn pres);
    Long DeletePrescription(Long id );
    Optional<Prscrptn> getPrescription(Long id );
    List<Prscrptn> getPrescriptions();
    List<String> findDrugByname(String keyword);
    List<String> findTreatmentByname(String keyword);


}
