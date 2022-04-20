package com.bezkoder.springjwt.service;


import com.bezkoder.springjwt.models.PrscrptnDta;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface drugsInInventoryService {
    PrscrptnDta saveDrugInv(PrscrptnDta di);
    List<PrscrptnDta> getDrugInv();
    Optional<PrscrptnDta> getDrugInvById(Long id);
    PrscrptnDta UpdateDrugInv (PrscrptnDta di);
    Long DeleteDrugInv(Long id );
}
