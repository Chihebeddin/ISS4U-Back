package com.bezkoder.springjwt.service;

import com.bezkoder.springjwt.models.medicalActs;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface medicalActService {
    medicalActs saveMedicalAct (medicalActs ma);
    medicalActs UpdateMedicalAct (medicalActs ma);
    Long DeleteMedicalAct(Long id );
    Optional<medicalActs> getMedicalAct(Long id );
    List<medicalActs> getMedicalAct();

}
