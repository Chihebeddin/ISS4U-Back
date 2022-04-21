package com.bezkoder.springjwt.models;

import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Prscrptn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Prscrptn_Ky;


    @ManyToOne
    private examSchdld Prscrptn_PrntExamSchdld;

    private String Prscrptn_PrntTbl;

    @ManyToOne
    @JoinColumn(name="prscrptns")
    private drug Prscrptn_DrgPrntKy;

    @OneToOne(cascade = CascadeType.ALL)
    private PrscrptnDta prscrptnDta;

    public Long getPrscrptn_Ky() {
        return Prscrptn_Ky;
    }

    public void setPrscrptn_Ky(Long prscrptn_Ky) {
        Prscrptn_Ky = prscrptn_Ky;
    }

    public examSchdld getPrscrptn_PrntExamSchdld() {
        return Prscrptn_PrntExamSchdld;
    }

    public void setPrscrptn_PrntExamSchdld(examSchdld prscrptn_PrntExamSchdld) {
        Prscrptn_PrntExamSchdld = prscrptn_PrntExamSchdld;
    }



    public String getPrscrptn_PrntTbl() {
        return Prscrptn_PrntTbl;
    }

    public void setPrscrptn_PrntTbl(String prscrptn_PrntTbl) {
        Prscrptn_PrntTbl = prscrptn_PrntTbl;
    }

    public drug getPrscrptn_DrgPrntKy() {
        return Prscrptn_DrgPrntKy;
    }

    public void setPrscrptn_DrgPrntKy(drug prscrptn_DrgPrntKy) {
        Prscrptn_DrgPrntKy = prscrptn_DrgPrntKy;
    }

    public PrscrptnDta getPrscrptnDta() {
        return prscrptnDta;
    }

    public void setPrscrptnDta(PrscrptnDta prscrptnDta) {
        this.prscrptnDta = prscrptnDta;
    }

    public Prscrptn(Long prscrptn_Ky, examSchdld prscrptn_PrntExamSchdld, String prscrptn_PrntTbl, drug prscrptn_DrgPrntKy, PrscrptnDta prscrptnDta) {
        Prscrptn_Ky = prscrptn_Ky;
        Prscrptn_PrntExamSchdld = prscrptn_PrntExamSchdld;

        Prscrptn_PrntTbl = prscrptn_PrntTbl;
        Prscrptn_DrgPrntKy = prscrptn_DrgPrntKy;
        this.prscrptnDta = prscrptnDta;
    }

    public Prscrptn() {
    }

    }