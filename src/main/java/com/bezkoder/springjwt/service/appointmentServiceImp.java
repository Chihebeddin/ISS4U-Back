package com.bezkoder.springjwt.service;



import com.bezkoder.springjwt.models.appointment;
import com.bezkoder.springjwt.repository.appointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service

public class appointmentServiceImp implements appointmentService{
    @Autowired
    private appointmentRepo appointmentrepo;



    @Override
    public appointment saveAppointment(appointment app) {

        return appointmentrepo.save(app);
    }

    @Override
    public appointment getAppointment(Date date) {
        return appointmentrepo.findByDate(date);
    }

    @Override
    public List<appointment> getAppoinments() {
        return appointmentrepo.findAll();
    }
}
