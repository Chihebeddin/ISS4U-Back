package com.bezkoder.springjwt.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Mact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long mact_Id;
    private String name;
    private Long tarif;
    @JsonIgnore
    @ManyToMany(mappedBy = "acts")
   private List<medicalActs> madicalActList;
    public Mact() {
    }

    public Mact(Long mact_Id, String name, Long tarif ) {
        this.mact_Id = mact_Id;
        this.name = name;
        this.tarif = tarif;

    }



    public Long getMact_Id() {
        return mact_Id;
    }

    public void setMact_Id(Long mact_Id) {
        this.mact_Id = mact_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTarif() {
        return tarif;
    }

    public void setTarif(Long tarif) {
        this.tarif = tarif;
    }
}

