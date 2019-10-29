package com.brightflag.service;

import com.brightflag.domain.Subject;
import com.brightflag.domain.SubjectTable;
import com.brightflag.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {
    @Autowired
    SubjectRepository subjectRepository;
    public Subject getSubject(Integer subjectID){
        return subjectRepository.getSubject(subjectID);
    }

    public List<SubjectTable> getSubjectListOfStudent(Integer studentID) {
        return subjectRepository.getSubjectListOfStudent(studentID);
    }

    public List<SubjectTable> getSubjectTableList() {
        return subjectRepository.getSubjectTableList();
    }

    public List<Subject> getSubjectList() {
        return subjectRepository.getSubjectList();
    }
}
