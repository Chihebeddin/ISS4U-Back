package com.bezkoder.springjwt.models;


import javax.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long patient_id;
    private String fname;
    private String lname;
    private Date dob;
    private String adress;
    private int phoneNumber;
    private String email;
    private String sex ;
    @OneToMany
    @JoinColumn(name="patient")
    private List<Prscrptn> Prscrptns;
    @OneToMany
    private List<medicalActs> medicalActs;
    @OneToMany
    @JoinColumn(name="patient")
    private  List<appointment> appointments;



    public patient() {
    }

    public patient(Long patient_id, String fname, String lname, Date dob, String adress, int phoneNumber, String email, String sex, List<Prscrptn> Prscrptns, List<com.bezkoder.springjwt.models.medicalActs> medicalActs, List<appointment> appointments) {
        this.patient_id = patient_id;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.sex = sex;
        this.Prscrptns = Prscrptns;
        this.medicalActs = medicalActs;
        this.appointments = appointments;
    }

    public Long getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(Long patient_id) {
        this.patient_id = patient_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<Prscrptn> getPrescriptions() {
        return Prscrptns;
    }

    public void setPrescriptions(List<Prscrptn> Prscrptns) {
        this.Prscrptns = Prscrptns;
    }

    public List<medicalActs> getMedicalActs() {
        return medicalActs;
    }

    public void setMedicalActs(List<medicalActs> medicalActs) {
        this.medicalActs = medicalActs;
    }

    public List<appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<appointment> appointments) {
        this.appointments = appointments;
    }
}
