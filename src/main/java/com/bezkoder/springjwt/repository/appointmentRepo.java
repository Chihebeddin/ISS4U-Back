package com.bezkoder.springjwt.repository;


import com.bezkoder.springjwt.models.appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;

public interface appointmentRepo extends JpaRepository<appointment,Long> {
    @Query("select a  from appointment a")
    appointment findByDate (Date date);
}
