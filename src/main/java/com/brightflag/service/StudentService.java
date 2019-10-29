package com.brightflag.service;

import java.util.List;

import com.brightflag.domain.Subject;
import com.brightflag.domain.SubjectTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brightflag.domain.Student;
import com.brightflag.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	public List<Student> getStudents() {
		return studentRepository.getStudents();
	}

	public List<Subject> getSubjects(){
		return studentRepository.getSubjects();
	}

	public void addSubject(Integer studentID, Integer subjectID, String subjectName) {
		studentRepository.addSubject(studentID,subjectID,subjectName);
	}

	public List<SubjectTable> getSubjectTable() {
		return studentRepository.getSubjectTable();
	}

	public List<SubjectTable> showALL() {
		return studentRepository.showALL();
	}

	public Student getStudentById(Integer studentID) {
		return studentRepository.getstudentById(studentID);
	}
}
