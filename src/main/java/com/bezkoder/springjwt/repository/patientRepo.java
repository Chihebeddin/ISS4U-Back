package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface patientRepo extends JpaRepository<patient,Long> {
}
