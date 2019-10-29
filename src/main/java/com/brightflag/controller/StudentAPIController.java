package com.brightflag.controller;

import com.brightflag.domain.Student;
import com.brightflag.domain.Subject;
import com.brightflag.domain.SubjectTable;
import com.brightflag.service.StudentService;
import com.brightflag.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class StudentAPIController {

	@Autowired
	private StudentService studentService;

	@Autowired
	private SubjectService subjectService;

	@RequestMapping("/api/getStudents")
	public List<Student> getStudents() {
		// TODO populate students subjects list
		return studentService.getStudents();
	}

	@RequestMapping("/api/getStudent")
	public Student getStudentById(Integer studentID){
		return studentService.getStudentById(studentID);
	}



	@RequestMapping("/showAll")
	public List<SubjectTable> showALL(){
		return studentService.showALL();
	}

}
