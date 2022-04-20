package com.bezkoder.springjwt.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class drug {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long Drug_Ky;
    private String Drug_Nm ;
    private String Drug_Usability;
/*@JsonIgnore
 @ManyToMany(mappedBy = "drugs")
 private List<PrscrptnDta>drugInventories;*/


    @OneToOne(mappedBy = "Prscrptn_DrgPrntKy")
    private Prscrptn prscrptns;

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



    public Prscrptn getPrscrptns() {
        return prscrptns;
    }

    public void setPrscrptns(Prscrptn prscrptns) {
        this.prscrptns = prscrptns;
    }

    public String getUsability() {
        return usability;
    }

    public void setUsability(String usability) {
        this.usability = usability;
    }

    private String usability;

    public drug(Long drug_Ky, String drug_Nm, String drug_Usability, Prscrptn prscrptns, String usability) {
        Drug_Ky = drug_Ky;
        Drug_Nm = drug_Nm;
        Drug_Usability = drug_Usability;
        this.prscrptns = prscrptns;
        this.usability = usability;
    }

    public drug() {
    }


}
