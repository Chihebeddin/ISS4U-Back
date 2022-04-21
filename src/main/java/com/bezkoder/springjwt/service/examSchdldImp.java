package com.bezkoder.springjwt.service;

import com.bezkoder.springjwt.models.examSchdld;
import com.bezkoder.springjwt.repository.examSchdldRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class examSchdldImp implements examSchdldService {

    @Autowired
    private examSchdldRepo repo;

    @Override
    public examSchdld UpdateExam(examSchdld exam) {
        return repo.save(exam);
    }

    @Override
    public List<examSchdld> getExams() {
        return repo.findAll();
    }
}
