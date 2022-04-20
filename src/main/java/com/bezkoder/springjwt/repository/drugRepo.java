package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.drug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface drugRepo extends JpaRepository<drug,Long> {
    @Query(value="select m.name from drug m where m.name like %:keyword%")
    List<String> findName(@Param("keyword") String keyword);
    @Query(value="select m from drug m where m.name like %:keyword%")
    List<drug> findDrug (@Param("keyword") String keyword);
}
