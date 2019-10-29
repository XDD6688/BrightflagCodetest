package com.brightflag.service;

import com.brightflag.domain.Grade;
import com.brightflag.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;



@Service
public class GradeService {

    @Autowired
    private GradeRepository gradeRepository;

    public List<Grade> getAllGrades() {
        return gradeRepository.getAllGrades();
    }

    public void addGrades(Integer studentID, String lastName, Integer examID, String examName, Integer grade) {
        gradeRepository.addGrades(studentID,lastName,examID,examName,grade);
    }

    public void clear() {
        gradeRepository.clear();
    }

    public List<Grade> getGradeByExamID(Integer examID) {
        return gradeRepository.getGradeByExamID(examID);
    }

    public List<Grade> getGradeByStudentID(Integer StudentID) {
        return gradeRepository.getGradeByStudentID(StudentID);
    }
}
