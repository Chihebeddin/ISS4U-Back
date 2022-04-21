package com.bezkoder.springjwt.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class examSchdld {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ExamSchdld_Ky;
    @ManyToOne
    private Ptnt ExamSchdld_PrntKy;
    private String ExamSchdld_Nm;
    private int ExamSchdld_PrntRfrnt;
    private int ExamSchdld_PrntRm;
    @Temporal(TemporalType.TIMESTAMP)
    private Date ExamSchdld_UnxTmBgn;
    @Temporal(TemporalType.TIMESTAMP)
    private Date ExamSchdld_UnxTmEnd;

    @OneToMany(cascade=CascadeType.MERGE, mappedBy = "Prscrptn_DrgPrntKy")
    private List<Prscrptn> prscrptns;

    public int getExamSchdld_Ky() {
        return ExamSchdld_Ky;
    }

    public void setExamSchdld_Ky(int examSchdld_Ky) {
        ExamSchdld_Ky = examSchdld_Ky;
    }

    public Ptnt getExamSchdld_PrntKy() {
        return ExamSchdld_PrntKy;
    }

    public void setExamSchdld_PrntKy(Ptnt examSchdld_PrntKy) {
        ExamSchdld_PrntKy = examSchdld_PrntKy;
    }

    public String getExamSchdld_Nm() {
        return ExamSchdld_Nm;
    }

    public void setExamSchdld_Nm(String examSchdld_Nm) {
        ExamSchdld_Nm = examSchdld_Nm;
    }

    public int getExamSchdld_PrntRfrnt() {
        return ExamSchdld_PrntRfrnt;
    }

    public void setExamSchdld_PrntRfrnt(int examSchdld_PrntRfrnt) {
        ExamSchdld_PrntRfrnt = examSchdld_PrntRfrnt;
    }

    public int getExamSchdld_PrntRm() {
        return ExamSchdld_PrntRm;
    }

    public void setExamSchdld_PrntRm(int examSchdld_PrntRm) {
        ExamSchdld_PrntRm = examSchdld_PrntRm;
    }

    public Date getExamSchdld_UnxTmBgn() {
        return ExamSchdld_UnxTmBgn;
    }

    public void setExamSchdld_UnxTmBgn(Date examSchdld_UnxTmBgn) {
        ExamSchdld_UnxTmBgn = examSchdld_UnxTmBgn;
    }

    public Date getExamSchdld_UnxTmEnd() {
        return ExamSchdld_UnxTmEnd;
    }

    public void setExamSchdld_UnxTmEnd(Date examSchdld_UnxTmEnd) {
        ExamSchdld_UnxTmEnd = examSchdld_UnxTmEnd;
    }

    public List<Prscrptn> getPrscrptns() {
        return prscrptns;
    }

    public void setPrscrptns(List<Prscrptn> prscrptns) {
        this.prscrptns = prscrptns;
    }

    public examSchdld() {
    }

    public examSchdld(int examSchdld_Ky, Ptnt examSchdld_PrntKy, String examSchdld_Nm, int examSchdld_PrntRfrnt, int examSchdld_PrntRm, Date examSchdld_UnxTmBgn, Date examSchdld_UnxTmEnd, List<Prscrptn> prscrptns) {
        ExamSchdld_Ky = examSchdld_Ky;
        ExamSchdld_PrntKy = examSchdld_PrntKy;
        ExamSchdld_Nm = examSchdld_Nm;
        ExamSchdld_PrntRfrnt = examSchdld_PrntRfrnt;
        ExamSchdld_PrntRm = examSchdld_PrntRm;
        ExamSchdld_UnxTmBgn = examSchdld_UnxTmBgn;
        ExamSchdld_UnxTmEnd = examSchdld_UnxTmEnd;
        this.prscrptns = prscrptns;
    }
}