package com.brightflag.service;


import com.brightflag.domain.ExamTable;
import com.brightflag.repository.ExamTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamTableService {
    @Autowired
    private ExamTableRepository examTableRepository;
    public void addExamTable(Integer studentID, String firsName, String lastName, Integer examID, String examName) {
        examTableRepository.addExamTable( studentID,  firsName,  lastName,  examID,  examName);
    }

    public List<ExamTable> getExamTables() {
        return examTableRepository.getExamTables();
    }

    public void clear() {
        examTableRepository.clear();
    }

    public List<ExamTable> getExamByExamID(Integer examID) {
        return examTableRepository.getExamByExamID(examID);
    }

    public List<ExamTable> getExamByStudentID(Integer studentID) {
        return examTableRepository.getExamByStudentID(studentID);
    }
}
