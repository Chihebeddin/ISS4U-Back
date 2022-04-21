package com.bezkoder.springjwt.repository;


import com.bezkoder.springjwt.models.Ptnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
@Repository

public interface PtntRepo extends JpaRepository<Ptnt,Long> {
    @Query(value="select p from ptnt p where p.Ptnt_RcrdSts =0 ")
    List<Ptnt> ValidPatient();
    @Query(value="select p from ptnt p where upper(p.Ptnt_Nm) like %:keyword%")
    List<Ptnt> findByName(@Param("keyword") String keyword);
    @Query(value="select p from ptnt p where p.Ptnt_MdlNm like %:keyword%")
    List<Ptnt> findByMName(@Param("keyword") String keyword);
    @Query(value="select p from ptnt p where p.Ptnt_BrthDt = :keyword")
    List<Ptnt> findByByBdate(@Param("keyword") Date keyword);
    @Query(value="select p from ptnt p where p.Ptnt_DthDt = :keyword")
    List<Ptnt> findByByDdate(@Param("keyword") Date keyword);


}