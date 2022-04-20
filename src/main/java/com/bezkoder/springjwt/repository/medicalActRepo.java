package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.medicalActs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface medicalActRepo extends JpaRepository<medicalActs,Long> {

}
