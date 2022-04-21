package com.bezkoder.springjwt.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
public class drug {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "drug_ky")
    private Long Drug_Ky;
    private String Drug_Nm ;
    private String Drug_Usability;


    @JsonIgnore
    @OneToMany(cascade=CascadeType.MERGE, mappedBy = "Prscrptn_DrgPrntKy")
    private List<Prscrptn> prscrptns;

    public drug(Long drug_Ky, String drug_Nm, String drug_Usability, List<Prscrptn> prscrptns) {
        Drug_Ky = drug_Ky;
        Drug_Nm = drug_Nm;
        Drug_Usability = drug_Usability;
        this.prscrptns = prscrptns;
    }

    public Long getDrug_Ky() {
        return Drug_Ky;
    }

    public void setDrug_Ky(Long drug_Ky) {
        Drug_Ky = drug_Ky;
    }

    public String getDrug_Nm() {
        return Drug_Nm;
    }

    public void setDrug_Nm(String drug_Nm) {
        Drug_Nm = drug_Nm;
    }

    public String getDrug_Usability() {
        return Drug_Usability;
    }

    public void setDrug_Usability(String drug_Usability) {
        Drug_Usability = drug_Usability;
    }

    public List<Prscrptn> getPrscrptns() {
        return prscrptns;
    }

    public void setPrscrptns(List<Prscrptn> prscrptns) {
        this.prscrptns = prscrptns;
    }

    public drug() {
    }


}
