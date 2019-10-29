package com.brightflag.service;


import com.brightflag.domain.Exam;
import com.brightflag.repository.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamService {

    @Autowired
    private ExamRepository examRepository;
    public List<Exam> getAllExams() {
        return examRepository.getAllExams();
    }
}
