package com.bezkoder.springjwt.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity(name = "ptnt")
@Table(indexes = {
        @Index(name = "PRIMARY", columnList = "ptnt_Ky"),
        @Index(name = "Ptnt_Ky02", columnList = "Ptnt_ExtrnlKy", unique = true),
        @Index(name = "Ptnt_Ky03", columnList = "Ptnt_Nm"),
        @Index(name = "Ptnt_Ky04", columnList = "Ptnt_MdlNm"),
        @Index(name = "Ptnt_Ky05", columnList = "Ptnt_BrthDt"),
        @Index(name = "Ptnt_Ky06", columnList = "Ptnt_DthDt"),
        @Index(name = "Ptnt_Ky07", columnList = "Ptnt_UnxTmUpdt")
})
public class Ptnt implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long Ptnt_Ky;
    private String Ptnt_ExtrnlKy;
    @Column( nullable=false)
    private String Ptnt_Nm;
    @Column( nullable=false)
    private String Ptnt_FrstNm;
    private String Ptnt_MdlNm;
    private int Ptnt_CvlSts;
    @Temporal(TemporalType.DATE)
    private Date Ptnt_BrthDt;
    private int Ptnt_Sx ;
    private String Ptnt_IdnttyNmbr;
    @Column(length=10)
    private int Ptnt_IdnttyTp ;
    @Column(length=10)
    private int Ptnt_Ntnlty ;
    private Date Ptnt_DthDt;
    private String Ptnt_DthRmrqs;
    @Column(length=10)
    private int Ptnt_Sz;
    @Column(length=10)
    private int Ptnt_Wght;
    private String Ptnt_Rmrqs;
    private int Ptnt_Sts;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="ptnt")
    private List<DmgrphcAddrss> dmgrphcAddrss;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="ptnt")
    private List<DmgrphcEml> dmgrphcEml;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ptnt")
    private List<DmgrphcPhn> dmgrphcPhn;
    @Temporal(TemporalType.TIMESTAMP)
    private Date Ptnt_UnxTmCrt;
    @Temporal(TemporalType.TIMESTAMP)
    private Date Ptnt_UnxTmUpdt;
    private int Ptnt_RcrdSts;
    @OneToMany
    @JoinColumn(name="ExamSchdld_PrntKy")
    private List<examSchdld> examSchdlds;

    public Ptnt() {
    }

    public List<examSchdld> getExamSchdlds() {
        return examSchdlds;
    }

    public void setExamSchdlds(List<examSchdld> examSchdlds) {
        this.examSchdlds = examSchdlds;
    }

    public Ptnt(Long ptnt_Ky, String ptnt_ExtrnlKy, String ptnt_Nm, String ptnt_FrstNm, String ptnt_MdlNm, int ptnt_CvlSts, Date ptnt_BrthDt, int ptnt_Sx, String ptnt_IdnttyNmbr, int ptnt_IdnttyTp, int ptnt_Ntnlty, Date ptnt_DthDt, String ptnt_DthRmrqs, int ptnt_Sz, int ptnt_Wght, String ptnt_Rmrqs, int ptnt_Sts, List<DmgrphcAddrss> dmgrphcAddrss, List<DmgrphcEml> dmgrphcEml, List<DmgrphcPhn> dmgrphcPhn, Date ptnt_UnxTmCrt, Date ptnt_UnxTmUpdt, int ptnt_RcrdSts, List<examSchdld> examSchdlds) {
        Ptnt_Ky = ptnt_Ky;
        Ptnt_ExtrnlKy = ptnt_ExtrnlKy;
        Ptnt_Nm = ptnt_Nm;
        Ptnt_FrstNm = ptnt_FrstNm;
        Ptnt_MdlNm = ptnt_MdlNm;
        Ptnt_CvlSts = ptnt_CvlSts;
        Ptnt_BrthDt = ptnt_BrthDt;
        Ptnt_Sx = ptnt_Sx;
        Ptnt_IdnttyNmbr = ptnt_IdnttyNmbr;
        Ptnt_IdnttyTp = ptnt_IdnttyTp;
        Ptnt_Ntnlty = ptnt_Ntnlty;
        Ptnt_DthDt = ptnt_DthDt;
        Ptnt_DthRmrqs = ptnt_DthRmrqs;
        Ptnt_Sz = ptnt_Sz;
        Ptnt_Wght = ptnt_Wght;
        Ptnt_Rmrqs = ptnt_Rmrqs;
        Ptnt_Sts = ptnt_Sts;
        this.dmgrphcAddrss = dmgrphcAddrss;
        this.dmgrphcEml = dmgrphcEml;
        this.dmgrphcPhn = dmgrphcPhn;
        Ptnt_UnxTmCrt = ptnt_UnxTmCrt;
        Ptnt_UnxTmUpdt = ptnt_UnxTmUpdt;
        Ptnt_RcrdSts = ptnt_RcrdSts;
        this.examSchdlds = examSchdlds;
    }

    public List<DmgrphcAddrss> getDmgrphcAddrss() {
        return dmgrphcAddrss;
    }

    public void setDmgrphcAddrss(List<DmgrphcAddrss> dmgrphcAddrss) {
        this.dmgrphcAddrss = dmgrphcAddrss;
    }

    public List<DmgrphcEml> getDmgrphcEml() {
        return dmgrphcEml;
    }

    public void setDmgrphcEml(List<DmgrphcEml> dmgrphcEml) {
        this.dmgrphcEml = dmgrphcEml;
    }

    public List<DmgrphcPhn> getDmgrphcPhn() {
        return dmgrphcPhn;
    }

    public void setDmgrphcPhn(List<DmgrphcPhn> dmgrphcPhn) {
        this.dmgrphcPhn = dmgrphcPhn;
    }

    public Long getPtnt_Ky() {
        return Ptnt_Ky;
    }

    public void setPtnt_Ky(Long ptnt_Ky) {
        Ptnt_Ky = ptnt_Ky;
    }

    public String getPtnt_ExtrnlKy() {
        return Ptnt_ExtrnlKy;
    }

    public void setPtnt_ExtrnlKy(String ptnt_ExtrnlKy) {
        Ptnt_ExtrnlKy = ptnt_ExtrnlKy;
    }

    public String getPtnt_Nm() {
        return Ptnt_Nm;
    }

    public void setPtnt_Nm(String ptnt_Nm) {
        Ptnt_Nm = ptnt_Nm;
    }

    public String getPtnt_FrstNm() {
        return Ptnt_FrstNm;
    }

    public void setPtnt_FrstNm(String ptnt_FrstNm) {
        Ptnt_FrstNm = ptnt_FrstNm;
    }

    public String getPtnt_MdlNm() {
        return Ptnt_MdlNm;
    }

    public void setPtnt_MdlNm(String ptnt_MdlNm) {
        Ptnt_MdlNm = ptnt_MdlNm;
    }

    public int getPtnt_CvlSts() {
        return Ptnt_CvlSts;
    }

    public void setPtnt_CvlSts(int ptnt_CvlSts) {
        Ptnt_CvlSts = ptnt_CvlSts;
    }

    public Date getPtnt_BrthDt() {
        return Ptnt_BrthDt;
    }

    public void setPtnt_BrthDt(Date ptnt_BrthDt) {
        Ptnt_BrthDt = ptnt_BrthDt;
    }

    public int getPtnt_Sx() {
        return Ptnt_Sx;
    }

    public void setPtnt_Sx(int ptnt_Sx) {
        Ptnt_Sx = ptnt_Sx;
    }

    public String getPtnt_IdnttyNmbr() {
        return Ptnt_IdnttyNmbr;
    }

    public void setPtnt_IdnttyNmbr(String ptnt_IdnttyNmbr) {
        Ptnt_IdnttyNmbr = ptnt_IdnttyNmbr;
    }

    public int getPtnt_IdnttyTp() {
        return Ptnt_IdnttyTp;
    }

    public void setPtnt_IdnttyTp(int ptnt_IdnttyTp) {
        Ptnt_IdnttyTp = ptnt_IdnttyTp;
    }

    public int getPtnt_Ntnlty() {
        return Ptnt_Ntnlty;
    }

    public void setPtnt_Ntnlty(int ptnt_Ntnlty) {
        Ptnt_Ntnlty = ptnt_Ntnlty;
    }

    public Date getPtnt_DthDt() {
        return Ptnt_DthDt;
    }

    public void setPtnt_DthDt(Date ptnt_DthDt) {
        Ptnt_DthDt = ptnt_DthDt;
    }

    public String getPtnt_DthRmrqs() {
        return Ptnt_DthRmrqs;
    }

    public void setPtnt_DthRmrqs(String ptnt_DthRmrqs) {
        Ptnt_DthRmrqs = ptnt_DthRmrqs;
    }

    public int getPtnt_Sz() {
        return Ptnt_Sz;
    }

    public void setPtnt_Sz(int ptnt_Sz) {
        Ptnt_Sz = ptnt_Sz;
    }

    public int getPtnt_Wght() {
        return Ptnt_Wght;
    }

    public void setPtnt_Wght(int ptnt_Wght) {
        Ptnt_Wght = ptnt_Wght;
    }

    public String getPtnt_Rmrqs() {
        return Ptnt_Rmrqs;
    }

    public void setPtnt_Rmrqs(String ptnt_Rmrqs) {
        Ptnt_Rmrqs = ptnt_Rmrqs;
    }

    public int getPtnt_Sts() {
        return Ptnt_Sts;
    }

    public void setPtnt_Sts(int ptnt_Sts) {
        Ptnt_Sts = ptnt_Sts;
    }

    public Date getPtnt_UnxTmCrt() {
        return Ptnt_UnxTmCrt;
    }

    public void setPtnt_UnxTmCrt(Date ptnt_UnxTmCrt) {
        Ptnt_UnxTmCrt = ptnt_UnxTmCrt;
    }

    public Date getPtnt_UnxTmUpdt() {
        return Ptnt_UnxTmUpdt;
    }

    public void setPtnt_UnxTmUpdt(Date ptnt_UnxTmUpdt) {
        Ptnt_UnxTmUpdt = ptnt_UnxTmUpdt;
    }

    public int getPtnt_RcrdSts() {
        return Ptnt_RcrdSts;
    }

    public void setPtnt_RcrdSts(int ptnt_RcrdSts) {
        Ptnt_RcrdSts = ptnt_RcrdSts;
    }
}

