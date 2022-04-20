package com.bezkoder.springjwt.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(indexes = {
        @Index(name = "PRIMARY", columnList = "DmgrphcEml_Ky")
})
public class DmgrphcEml implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long DmgrphcEml_Ky;
    private String DmgrphcEml_PrntTbl;
    // @Column(nullable=false)
    private int DmgrphcEml_PrntKy;
    private String DmgrphcEml_Eml;
    private int DmgrphcEml_Prmry;
    @ManyToOne
    private Ptnt ptnt;
    @Temporal(TemporalType.TIMESTAMP)
    private Date DmgrphcEml_UnxTmCrt;
    @Temporal(TemporalType.TIMESTAMP)
    private Date DmgrphcEml_UnxTmUpdt;
    private int DmgrphcEml_RcrdSts;

    public DmgrphcEml() {
    }

    public DmgrphcEml(Long dmgrphcEml_Ky, String dmgrphcEml_PrntTbl, int dmgrphcEml_PrntKy, String dmgrphcEml_Eml, int dmgrphcEml_Prmry, Ptnt ptnt, Date dmgrphcEml_UnxTmCrt, Date dmgrphcEml_UnxTmUpdt, int dmgrphcEml_RcrdSts) {
        DmgrphcEml_Ky = dmgrphcEml_Ky;
        DmgrphcEml_PrntTbl = dmgrphcEml_PrntTbl;
        DmgrphcEml_PrntKy = dmgrphcEml_PrntKy;
        DmgrphcEml_Eml = dmgrphcEml_Eml;
        DmgrphcEml_Prmry = dmgrphcEml_Prmry;
        this.ptnt = ptnt;
        DmgrphcEml_UnxTmCrt = dmgrphcEml_UnxTmCrt;
        DmgrphcEml_UnxTmUpdt = dmgrphcEml_UnxTmUpdt;
        DmgrphcEml_RcrdSts = dmgrphcEml_RcrdSts;
    }

    public Ptnt getPtnt() {
        return ptnt;
    }

    public void setPtnt(Ptnt ptnt) {
        this.ptnt = ptnt;
    }

    public Long getDmgrphcEml_Ky() {
        return DmgrphcEml_Ky;
    }

    public void setDmgrphcEml_Ky(Long dmgrphcEml_Ky) {
        DmgrphcEml_Ky = dmgrphcEml_Ky;
    }

    public String getDmgrphcEml_PrntTbl() {
        return DmgrphcEml_PrntTbl;
    }

    public void setDmgrphcEml_PrntTbl(String dmgrphcEml_PrntTbl) {
        DmgrphcEml_PrntTbl = dmgrphcEml_PrntTbl;
    }

    public int getDmgrphcEml_PrntKy() {
        return DmgrphcEml_PrntKy;
    }

    public void setDmgrphcEml_PrntKy(int dmgrphcEml_PrntKy) {
        DmgrphcEml_PrntKy = dmgrphcEml_PrntKy;
    }

    public String getDmgrphcEml_Eml() {
        return DmgrphcEml_Eml;
    }

    public void setDmgrphcEml_Eml(String dmgrphcEml_Eml) {
        DmgrphcEml_Eml = dmgrphcEml_Eml;
    }

    public int getDmgrphcEml_Prmry() {
        return DmgrphcEml_Prmry;
    }

    public void setDmgrphcEml_Prmry(int dmgrphcEml_Prmry) {
        DmgrphcEml_Prmry = dmgrphcEml_Prmry;
    }

    public Date getDmgrphcEml_UnxTmCrt() {
        return DmgrphcEml_UnxTmCrt;
    }

    public void setDmgrphcEml_UnxTmCrt(Date dmgrphcEml_UnxTmCrt) {
        DmgrphcEml_UnxTmCrt = dmgrphcEml_UnxTmCrt;
    }

    public Date getDmgrphcEml_UnxTmUpdt() {
        return DmgrphcEml_UnxTmUpdt;
    }

    public void setDmgrphcEml_UnxTmUpdt(Date dmgrphcEml_UnxTmUpdt) {
        DmgrphcEml_UnxTmUpdt = dmgrphcEml_UnxTmUpdt;
    }

    public int getDmgrphcEml_RcrdSts() {
        return DmgrphcEml_RcrdSts;
    }

    public void setDmgrphcEml_RcrdSts(int dmgrphcEml_RcrdSts) {
        DmgrphcEml_RcrdSts = dmgrphcEml_RcrdSts;
    }
}

