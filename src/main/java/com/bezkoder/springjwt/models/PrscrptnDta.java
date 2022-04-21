package com.bezkoder.springjwt.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class PrscrptnDta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long PrscrptnDta_Ky;

    @OneToOne(cascade = CascadeType.ALL)
    private Prscrptn PrscrptnDta_PrntPrscrptn;
    private int PrscrptnDta_Frq ;
    private String PrscrptnDta_PrdUnit;
    @Temporal(TemporalType.TIMESTAMP)
    private Date PrscrptnDta_UnxTmBgn;
    @Temporal(TemporalType.TIMESTAMP)
    private Date PrscrptnDta_UnxTmEnd;

    public Long getPrscrptnDta_Ky() {
        return PrscrptnDta_Ky;
    }

    public void setPrscrptnDta_Ky(Long prscrptnDta_Ky) {
        PrscrptnDta_Ky = prscrptnDta_Ky;
    }

    public Prscrptn getPrscrptnDta_PrntPrscrptn() {
        return PrscrptnDta_PrntPrscrptn;
    }

    public void setPrscrptnDta_PrntPrscrptn(Prscrptn prscrptnDta_PrntPrscrptn) {
        PrscrptnDta_PrntPrscrptn = prscrptnDta_PrntPrscrptn;
    }

    public int getPrscrptnDta_Frq() {
        return PrscrptnDta_Frq;
    }

    public void setPrscrptnDta_Frq(int prscrptnDta_Frq) {
        PrscrptnDta_Frq = prscrptnDta_Frq;
    }

    public String getPrscrptnDta_PrdUnit() {
        return PrscrptnDta_PrdUnit;
    }

    public void setPrscrptnDta_PrdUnit(String prscrptnDta_PrdUnit) {
        PrscrptnDta_PrdUnit = prscrptnDta_PrdUnit;
    }

    public Date getPrscrptnDta_UnxTmBgn() {
        return PrscrptnDta_UnxTmBgn;
    }

    public void setPrscrptnDta_UnxTmBgn(Date prscrptnDta_UnxTmBgn) {
        PrscrptnDta_UnxTmBgn = prscrptnDta_UnxTmBgn;
    }

    public Date getPrscrptnDta_UnxTmEnd() {
        return PrscrptnDta_UnxTmEnd;
    }

    public void setPrscrptnDta_UnxTmEnd(Date prscrptnDta_UnxTmEnd) {
        PrscrptnDta_UnxTmEnd = prscrptnDta_UnxTmEnd;
    }

    public PrscrptnDta() {
    }

    public PrscrptnDta(Long prscrptnDta_Ky, Prscrptn prscrptnDta_PrntPrscrptn, int prscrptnDta_Frq, String prscrptnDta_PrdUnit, Date prscrptnDta_UnxTmBgn, Date prscrptnDta_UnxTmEnd) {
        PrscrptnDta_Ky = prscrptnDta_Ky;
        PrscrptnDta_PrntPrscrptn = prscrptnDta_PrntPrscrptn;
        PrscrptnDta_Frq = prscrptnDta_Frq;
        PrscrptnDta_PrdUnit = prscrptnDta_PrdUnit;
        PrscrptnDta_UnxTmBgn = prscrptnDta_UnxTmBgn;
        PrscrptnDta_UnxTmEnd = prscrptnDta_UnxTmEnd;
    }
}
