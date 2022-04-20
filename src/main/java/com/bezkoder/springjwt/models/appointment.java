package com.bezkoder.springjwt.models;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import static javax.persistence.GenerationType.AUTO;
@Entity
public class appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String title;
    private Date start ;
    private Date end ;
    @ManyToOne
    private patient patient;


    public appointment() {
    }

    public appointment(Long id, String title, Date start, Date end, patient patient) {
        this.id = id;
        this.title = title;
        this.start = start;
        this.end = end;
        this.patient = patient;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public patient getPatient() {
        return patient;
    }

    public void setPatient(patient patient) {
        this.patient = patient;
    }
}
