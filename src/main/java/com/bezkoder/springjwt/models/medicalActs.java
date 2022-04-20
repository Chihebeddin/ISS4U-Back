package com.bezkoder.springjwt.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class medicalActs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long medicalAct_Id;

    @ManyToMany
    @JoinTable(
            name = "act_mact",
            joinColumns = @JoinColumn(name = "acts"),
            inverseJoinColumns = @JoinColumn(name = "madicalActList"))
    private List<Mact> acts;

    @JsonIgnore
    @ManyToOne
    private patient patient ;
    @ManyToOne
    private User user ;
    private Date date_added;
    @ElementCollection
    private List<Date> date_modified ;
    private boolean isDone;

    public medicalActs() {

    }

    public medicalActs(Long medicalAct_Id, List<Mact> acts, patient patient, User user, Date date_added, List<Date> date_modified, boolean isDone) {
        this.medicalAct_Id = medicalAct_Id;
        this.acts = acts;
        this.patient = patient;
        this.user = user;
        this.date_added = date_added;
        this.date_modified = date_modified;
        this.isDone = isDone;
    }

    public Long getMedicalAct_Id() {
        return medicalAct_Id;
    }

    public void setMedicalAct_Id(Long medicalAct_Id) {
        this.medicalAct_Id = medicalAct_Id;
    }

    public List<Mact> getActs() {
        return acts;
    }

    public void setActs(List<Mact> acts) {
        this.acts = acts;
    }

    public patient getPatient() {
        return patient;
    }

    public void setPatient(patient patient) {
        this.patient = patient;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
