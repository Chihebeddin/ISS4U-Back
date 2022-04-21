package com.bezkoder.springjwt.service;

import com.bezkoder.springjwt.models.*;
import com.bezkoder.springjwt.models.Prscrptn;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface examSchdldService {

    examSchdld UpdateExam (examSchdld exam);

    List<examSchdld> getExams();
}
