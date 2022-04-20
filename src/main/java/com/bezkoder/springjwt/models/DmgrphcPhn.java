package com.bezkoder.springjwt.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(indexes = {
        @Index(name = "PRIMARY", columnList = "DmgrphcPhn_Ky")
})
public class DmgrphcPhn implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long DmgrphcPhn_Ky;
    private String DmgrphcPhn_PrntTbl;
    // @Column(nullable=false)
    private int DmgrphcPhn_PrntKy;
    private String DmgrphcPhn_Cntry;
    private int DmgrphcPhn_Prfssnl;
    @Column(nullable=false)
    private String DmgrphcPhn_Nmbr;
    private int DmgrphcPhn_Tp;
    private int DmgrphcPhn_RcvSMS;
    private int DmgrphcPhn_Prmry;
    @ManyToOne
    private Ptnt ptnt;
    @Temporal(TemporalType.TIMESTAMP)
    private Date DmgrphcPhn_UnxTmCrt;
    @Temporal(TemporalType.TIMESTAMP)
    private Date DmgrphcPhn_UnxTmUpdt;
    private int DmgrphcPhn_RcrdSts;

    public DmgrphcPhn() {
    }

    public DmgrphcPhn(Long dmgrphcPhn_Ky, String dmgrphcPhn_PrntTbl, int dmgrphcPhn_PrntKy, String dmgrphcPhn_Cntry, int dmgrphcPhn_Prfssnl, String dmgrphcPhn_Nmbr, int dmgrphcPhn_Tp, int dmgrphcPhn_RcvSMS, int dmgrphcPhn_Prmry, Ptnt ptnt, Date dmgrphcPhn_UnxTmCrt, Date dmgrphcPhn_UnxTmUpdt, int dmgrphcPhn_RcrdSts) {
        DmgrphcPhn_Ky = dmgrphcPhn_Ky;
        DmgrphcPhn_PrntTbl = dmgrphcPhn_PrntTbl;
        DmgrphcPhn_PrntKy = dmgrphcPhn_PrntKy;
        DmgrphcPhn_Cntry = dmgrphcPhn_Cntry;
        DmgrphcPhn_Prfssnl = dmgrphcPhn_Prfssnl;
        DmgrphcPhn_Nmbr = dmgrphcPhn_Nmbr;
        DmgrphcPhn_Tp = dmgrphcPhn_Tp;
        DmgrphcPhn_RcvSMS = dmgrphcPhn_RcvSMS;
        DmgrphcPhn_Prmry = dmgrphcPhn_Prmry;
        this.ptnt = ptnt;
        DmgrphcPhn_UnxTmCrt = dmgrphcPhn_UnxTmCrt;
        DmgrphcPhn_UnxTmUpdt = dmgrphcPhn_UnxTmUpdt;
        DmgrphcPhn_RcrdSts = dmgrphcPhn_RcrdSts;
    }

    public Ptnt getPtnt() {
        return ptnt;
    }

    public void setPtnt(Ptnt ptnt) {
        this.ptnt = ptnt;
    }

    public Long getDmgrphcPhn_Ky() {
        return DmgrphcPhn_Ky;
    }

    public void setDmgrphcPhn_Ky(Long dmgrphcPhn_Ky) {
        DmgrphcPhn_Ky = dmgrphcPhn_Ky;
    }

    public String getDmgrphcPhn_PrntTbl() {
        return DmgrphcPhn_PrntTbl;
    }

    public void setDmgrphcPhn_PrntTbl(String dmgrphcPhn_PrntTbl) {
        DmgrphcPhn_PrntTbl = dmgrphcPhn_PrntTbl;
    }

    public int getDmgrphcPhn_PrntKy() {
        return DmgrphcPhn_PrntKy;
    }

    public void setDmgrphcPhn_PrntKy(int dmgrphcPhn_PrntKy) {
        DmgrphcPhn_PrntKy = dmgrphcPhn_PrntKy;
    }

    public String getDmgrphcPhn_Cntry() {
        return DmgrphcPhn_Cntry;
    }

    public void setDmgrphcPhn_Cntry(String dmgrphcPhn_Cntry) {
        DmgrphcPhn_Cntry = dmgrphcPhn_Cntry;
    }

    public int getDmgrphcPhn_Prfssnl() {
        return DmgrphcPhn_Prfssnl;
    }

    public void setDmgrphcPhn_Prfssnl(int dmgrphcPhn_Prfssnl) {
        DmgrphcPhn_Prfssnl = dmgrphcPhn_Prfssnl;
    }

    public String getDmgrphcPhn_Nmbr() {
        return DmgrphcPhn_Nmbr;
    }

    public void setDmgrphcPhn_Nmbr(String dmgrphcPhn_Nmbr) {
        DmgrphcPhn_Nmbr = dmgrphcPhn_Nmbr;
    }

    public int getDmgrphcPhn_Tp() {
        return DmgrphcPhn_Tp;
    }

    public void setDmgrphcPhn_Tp(int dmgrphcPhn_Tp) {
        DmgrphcPhn_Tp = dmgrphcPhn_Tp;
    }

    public int getDmgrphcPhn_RcvSMS() {
        return DmgrphcPhn_RcvSMS;
    }

    public void setDmgrphcPhn_RcvSMS(int dmgrphcPhn_RcvSMS) {
        DmgrphcPhn_RcvSMS = dmgrphcPhn_RcvSMS;
    }

    public int getDmgrphcPhn_Prmry() {
        return DmgrphcPhn_Prmry;
    }

    public void setDmgrphcPhn_Prmry(int dmgrphcPhn_Prmry) {
        DmgrphcPhn_Prmry = dmgrphcPhn_Prmry;
    }

    public Date getDmgrphcPhn_UnxTmCrt() {
        return DmgrphcPhn_UnxTmCrt;
    }

    public void setDmgrphcPhn_UnxTmCrt(Date dmgrphcPhn_UnxTmCrt) {
        DmgrphcPhn_UnxTmCrt = dmgrphcPhn_UnxTmCrt;
    }

    public Date getDmgrphcPhn_UnxTmUpdt() {
        return DmgrphcPhn_UnxTmUpdt;
    }

    public void setDmgrphcPhn_UnxTmUpdt(Date dmgrphcPhn_UnxTmUpdt) {
        DmgrphcPhn_UnxTmUpdt = dmgrphcPhn_UnxTmUpdt;
    }

    public int getDmgrphcPhn_RcrdSts() {
        return DmgrphcPhn_RcrdSts;
    }

    public void setDmgrphcPhn_RcrdSts(int dmgrphcPhn_RcrdSts) {
        DmgrphcPhn_RcrdSts = dmgrphcPhn_RcrdSts;
    }
}

