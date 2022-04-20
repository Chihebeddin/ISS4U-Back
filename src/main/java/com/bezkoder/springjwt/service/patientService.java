package com.bezkoder.springjwt.service;


import com.bezkoder.springjwt.models.patient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface patientService {
    patient savePatient (patient pt);
    patient UpdatePatient (patient pt);
    Long DeletePatient(Long id );
    Optional<patient> getPatient(Long id );
    List<patient> getPatients();
}
