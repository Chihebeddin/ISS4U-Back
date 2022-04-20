package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.PrscrptnDta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface drugsInInventoryRepo extends JpaRepository<PrscrptnDta,Long> {
}
