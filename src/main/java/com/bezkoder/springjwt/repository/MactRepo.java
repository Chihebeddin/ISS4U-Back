package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.Mact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MactRepo extends JpaRepository<Mact,Long> {
    @Query(value="select m.name from Mact m where m.name like %:keyword%")
    List<String> findName(@Param("keyword") String keyword);
    @Query(value="select m from Mact m where m.name like %:keyword%")
    List<Mact> findbyName(@Param("keyword") String keyword);
}
