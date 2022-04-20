package com.bezkoder.springjwt.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(indexes = {
        @Index(name = "PRIMARY", columnList = "DmgrphcAddrss_Ky"),
        @Index(name = "DmgrphcAddrss_Ky02", columnList = "DmgrphcAddrss_PrntKy")
})
public class DmgrphcAddrss  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long DmgrphcAddrss_Ky;
    private String DmgrphcAddrss_PrntTbl;
    //@Column(nullable=false)
    private int DmgrphcAddrss_PrntKy;
    private int DmgrphcAddrss_Tp;
    private int DmgrphcAddrss_Prmry;
    private int DmgrphcAddrss_Vld;
    @Column(nullable=false)
    private int DmgrphcAddrss_PstlCd;
    @Column(nullable=false)
    private int DmgrphcAddrss_StreetNmbr;
    @Column(nullable=false)
    private String DmgrphcAddrss_Addrss;
    private String DmgrphcAddrss_City;
    private String DmgrphcAddrss_Cntry;
    @ManyToOne
    private Ptnt ptnt;
    @Temporal(TemporalType.TIMESTAMP)
    private Date DmgrphcAddrss_UnxTmCrt;
    @Temporal(TemporalType.TIMESTAMP)
    private Date DmgrphcAddrss_UnxTmUpdt;
    private int DmgrphcAddrss_RcrdSts;

    public DmgrphcAddrss() {
    }

    public DmgrphcAddrss(Long dmgrphcAddrss_Ky, String dmgrphcAddrss_PrntTbl, int dmgrphcAddrss_PrntKy, int dmgrphcAddrss_Tp, int dmgrphcAddrss_Prmry, int dmgrphcAddrss_Vld, int dmgrphcAddrss_PstlCd, int dmgrphcAddrss_StreetNmbr, String dmgrphcAddrss_Addrss, String dmgrphcAddrss_City, String dmgrphcAddrss_Cntry, Ptnt ptnt, Date dmgrphcAddrss_UnxTmCrt, Date dmgrphcAddrss_UnxTmUpdt, int dmgrphcAddrss_RcrdSts) {
        DmgrphcAddrss_Ky = dmgrphcAddrss_Ky;
        DmgrphcAddrss_PrntTbl = dmgrphcAddrss_PrntTbl;
        DmgrphcAddrss_PrntKy = dmgrphcAddrss_PrntKy;
        DmgrphcAddrss_Tp = dmgrphcAddrss_Tp;
        DmgrphcAddrss_Prmry = dmgrphcAddrss_Prmry;
        DmgrphcAddrss_Vld = dmgrphcAddrss_Vld;
        DmgrphcAddrss_PstlCd = dmgrphcAddrss_PstlCd;
        DmgrphcAddrss_StreetNmbr = dmgrphcAddrss_StreetNmbr;
        DmgrphcAddrss_Addrss = dmgrphcAddrss_Addrss;
        DmgrphcAddrss_City = dmgrphcAddrss_City;
        DmgrphcAddrss_Cntry = dmgrphcAddrss_Cntry;
        this.ptnt = ptnt;
        DmgrphcAddrss_UnxTmCrt = dmgrphcAddrss_UnxTmCrt;
        DmgrphcAddrss_UnxTmUpdt = dmgrphcAddrss_UnxTmUpdt;
        DmgrphcAddrss_RcrdSts = dmgrphcAddrss_RcrdSts;
    }

    public Ptnt getPtnt() {
        return ptnt;
    }

    public void setPtnt(Ptnt ptnt) {
        this.ptnt = ptnt;
    }

    public Long getDmgrphcAddrss_Ky() {
        return DmgrphcAddrss_Ky;
    }

    public void setDmgrphcAddrss_Ky(Long dmgrphcAddrss_Ky) {
        DmgrphcAddrss_Ky = dmgrphcAddrss_Ky;
    }

    public String getDmgrphcAddrss_PrntTbl() {
        return DmgrphcAddrss_PrntTbl;
    }

    public void setDmgrphcAddrss_PrntTbl(String dmgrphcAddrss_PrntTbl) {
        DmgrphcAddrss_PrntTbl = dmgrphcAddrss_PrntTbl;
    }

    public int getDmgrphcAddrss_PrntKy() {
        return DmgrphcAddrss_PrntKy;
    }

    public void setDmgrphcAddrss_PrntKy(int dmgrphcAddrss_PrntKy) {
        DmgrphcAddrss_PrntKy = dmgrphcAddrss_PrntKy;
    }

    public int getDmgrphcAddrss_Tp() {
        return DmgrphcAddrss_Tp;
    }

    public void setDmgrphcAddrss_Tp(int dmgrphcAddrss_Tp) {
        DmgrphcAddrss_Tp = dmgrphcAddrss_Tp;
    }

    public int getDmgrphcAddrss_Prmry() {
        return DmgrphcAddrss_Prmry;
    }

    public void setDmgrphcAddrss_Prmry(int dmgrphcAddrss_Prmry) {
        DmgrphcAddrss_Prmry = dmgrphcAddrss_Prmry;
    }

    public int getDmgrphcAddrss_Vld() {
        return DmgrphcAddrss_Vld;
    }

    public void setDmgrphcAddrss_Vld(int dmgrphcAddrss_Vld) {
        DmgrphcAddrss_Vld = dmgrphcAddrss_Vld;
    }

    public int getDmgrphcAddrss_PstlCd() {
        return DmgrphcAddrss_PstlCd;
    }

    public void setDmgrphcAddrss_PstlCd(int dmgrphcAddrss_PstlCd) {
        DmgrphcAddrss_PstlCd = dmgrphcAddrss_PstlCd;
    }

    public int getDmgrphcAddrss_StreetNmbr() {
        return DmgrphcAddrss_StreetNmbr;
    }

    public void setDmgrphcAddrss_StreetNmbr(int dmgrphcAddrss_StreetNmbr) {
        DmgrphcAddrss_StreetNmbr = dmgrphcAddrss_StreetNmbr;
    }

    public String getDmgrphcAddrss_Addrss() {
        return DmgrphcAddrss_Addrss;
    }

    public void setDmgrphcAddrss_Addrss(String dmgrphcAddrss_Addrss) {
        DmgrphcAddrss_Addrss = dmgrphcAddrss_Addrss;
    }

    public String getDmgrphcAddrss_City() {
        return DmgrphcAddrss_City;
    }

    public void setDmgrphcAddrss_City(String dmgrphcAddrss_City) {
        DmgrphcAddrss_City = dmgrphcAddrss_City;
    }

    public String getDmgrphcAddrss_Cntry() {
        return DmgrphcAddrss_Cntry;
    }

    public void setDmgrphcAddrss_Cntry(String dmgrphcAddrss_Cntry) {
        DmgrphcAddrss_Cntry = dmgrphcAddrss_Cntry;
    }

    public Date getDmgrphcAddrss_UnxTmCrt() {
        return DmgrphcAddrss_UnxTmCrt;
    }

    public void setDmgrphcAddrss_UnxTmCrt(Date dmgrphcAddrss_UnxTmCrt) {
        DmgrphcAddrss_UnxTmCrt = dmgrphcAddrss_UnxTmCrt;
    }

    public Date getDmgrphcAddrss_UnxTmUpdt() {
        return DmgrphcAddrss_UnxTmUpdt;
    }

    public void setDmgrphcAddrss_UnxTmUpdt(Date dmgrphcAddrss_UnxTmUpdt) {
        DmgrphcAddrss_UnxTmUpdt = dmgrphcAddrss_UnxTmUpdt;
    }

    public int getDmgrphcAddrss_RcrdSts() {
        return DmgrphcAddrss_RcrdSts;
    }

    public void setDmgrphcAddrss_RcrdSts(int dmgrphcAddrss_RcrdSts) {
        DmgrphcAddrss_RcrdSts = dmgrphcAddrss_RcrdSts;
    }
}

