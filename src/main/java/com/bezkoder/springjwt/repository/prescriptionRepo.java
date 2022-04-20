package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.Prscrptn;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface prescriptionRepo extends JpaRepository<Prscrptn,Long> {

    @Query(value="select m.name from drug m where m.name like %:keyword%")
    List<String> findDrugByName(@Param("keyword") String keyword);
    @Query(value="select t.name from treatment t where t.name like %:keyword%")
    List<String> findTreatmentByName(@Param("keyword") String keyword);

}
