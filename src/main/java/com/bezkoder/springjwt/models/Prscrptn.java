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
    private List<examSchdld> Prscrptn_PrntExamSchdld;
    /*@ManyToMany
    @JoinTable(  name = "prescription_drug",
            joinColumns = @JoinColumn(name = "drugs"),
            inverseJoinColumns = @JoinColumn(name = "prescriptions"))
    private List<drug> drugs;*/

    private String Prscrptn_PrntTbl;
    @OneToOne(cascade = CascadeType.ALL)
    private drug Prscrptn_DrgPrntKy;

    @OneToOne(cascade = CascadeType.ALL)
    private PrscrptnDta prscrptnDta;

    private Date date_added;
    @ElementCollection
    private List<Date> date_modified;
    private Date start_date;


    public Prscrptn() {
    }

    public Long getPrscrptn_Ky() {
        return Prscrptn_Ky;
    }

    public void setPrscrptn_Ky(Long prscrptn_Ky) {
        Prscrptn_Ky = prscrptn_Ky;
    }

    public List<examSchdld> getPrscrptn_PrntExamSchdld() {
        return Prscrptn_PrntExamSchdld;
    }

    public void setPrscrptn_PrntExamSchdld(List<examSchdld> prscrptn_PrntExamSchdld) {
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

    public Date getDate_added() {
        return date_added;
    }

    public void setDate_added(Date date_added) {
        this.date_added = date_added;
    }

    public List<Date> getDate_modified() {
        return date_modified;
    }

    public void setDate_modified(List<Date> date_modified) {
        this.date_modified = date_modified;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Prscrptn(Long prscrptn_Ky, List<examSchdld> prscrptn_PrntExamSchdld, String prscrptn_PrntTbl, drug prscrptn_DrgPrntKy, PrscrptnDta prscrptnDta, Date date_added, List<Date> date_modified, Date start_date) {
        Prscrptn_Ky = prscrptn_Ky;
        Prscrptn_PrntExamSchdld = prscrptn_PrntExamSchdld;
        Prscrptn_PrntTbl = prscrptn_PrntTbl;
        Prscrptn_DrgPrntKy = prscrptn_DrgPrntKy;
        this.prscrptnDta = prscrptnDta;
        this.date_added = date_added;
        this.date_modified = date_modified;
        this.start_date = start_date;
    }
}