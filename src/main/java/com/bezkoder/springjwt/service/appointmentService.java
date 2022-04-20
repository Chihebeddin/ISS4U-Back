package com.bezkoder.springjwt.service;


import com.bezkoder.springjwt.models.appointment;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public interface appointmentService {
    appointment saveAppointment (appointment app);

    appointment getAppointment(Date date );
    List<appointment> getAppoinments();
}
