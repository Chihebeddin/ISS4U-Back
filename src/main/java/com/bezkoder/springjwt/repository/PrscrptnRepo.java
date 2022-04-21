package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface PrscrptnRepo extends JpaRepository<Prscrptn, Long> {


}
