package com.bezkoder.springjwt.repository;


import com.bezkoder.springjwt.models.Ptnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Repository

public interface PtntRepo extends JpaRepository<Ptnt,Long> {
//    @Query(value="select p from ptnt p where p.ptnt_RcrdSts =0 ")
//    List<Ptnt> ValidPatient();
}