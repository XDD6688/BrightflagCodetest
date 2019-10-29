package com.brightflag.controller;

import com.brightflag.domain.*;
import com.brightflag.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TemplateController {

	@Autowired
	private SubjectService subjectService;
	@Autowired
	private StudentService studentService;
	@Autowired
	private ExamTableService examTableService;
	@Autowired
	private ExamService examService;
	@Autowired
	private GradeService gradeService;


	@RequestMapping("/")
	public String main(Model model) {
		List<Student> studentList = studentService.getStudents();
		List<List<String>> listList = new ArrayList<>();
		for(Student student :studentList){
			Integer id = student.getStudentID();
			List<SubjectTable> subjectTables = subjectService.getSubjectListOfStudent(id);
			List<String> names = new ArrayList<>();
			for(SubjectTable subjectTable:subjectTables){
				names.add(subjectTable.getSubjectName());
			}
			listList.add(names);
		}
		model.addAttribute("studentList",studentList);
		model.addAttribute("listList",listList);
		return "index";
	}

	@RequestMapping("/add")
	public String add(Model model) {
		List<Subject> subjectList = subjectService.getSubjectList();
		model.addAttribute("subjectList",subjectList);
		return "add";
	}

	@RequestMapping("/exam")
	public String exam(Model model)
	{
		//get all data from SubjectTable
		examTableService.clear();
		List<SubjectTable> subjectTables = subjectService.getSubjectTableList();
		for(SubjectTable subjectTable : subjectTables){
			ExamTable examTable = new ExamTable();
			examTable.setStudentID(subjectTable.getStudentID());
			examTable.setFirsName(studentService.getStudentById(subjectTable.getStudentID()).getFirstName());
			examTable.setLastName(studentService.getStudentById(subjectTable.getStudentID()).getLastName());
			examTable.setExamName(subjectTable.getSubjectName());
			examTable.setExamID(subjectTable.getSubjectID());
			examTableService.addExamTable(examTable.getStudentID(), examTable.getFirsName(), examTable.getLastName(), examTable.getExamID(), examTable.getExamName());
		}

		List<ExamTable> examTables = examTableService.getExamTables();
		model.addAttribute("examTables",examTables);


		List<Student> studentList = studentService.getStudents();
		model.addAttribute("studentList",studentList);

		List<Exam> examList = examService.getAllExams();
		model.addAttribute("examList",examList);
		return "exam";
	}


	@RequestMapping("/grade")
	public String grade(Model model) {
		gradeService.clear();
		List<ExamTable> examTableList = examTableService.getExamTables();
		for(ExamTable examTable : examTableList){
			Grade grade = new Grade();
			grade.setStudentID(examTable.getStudentID());
			grade.setLastName(examTable.getLastName());
			grade.setExamID(examTable.getExamID());
			grade.setExamName(examTable.getExamName());
			grade.setGrade(0);
			gradeService.addGrades(grade.getStudentID(),grade.getLastName(),grade.getExamID(),grade.getExamName(),grade.getGrade());
		}
		List<Grade> gradeList = gradeService.getAllGrades();
		for(Grade grade : gradeList){
			System.out.println(grade.getStudentID());
		}
		model.addAttribute("gradeList",gradeList);
		List<Student> studentList = studentService.getStudents();
		model.addAttribute("studentList",studentList);

		List<Exam> examList = examService.getAllExams();
		model.addAttribute("examList",examList);
		return "grade";
	}
}
