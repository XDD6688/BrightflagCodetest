package com.brightflag.controller;


import com.brightflag.domain.Exam;
import com.brightflag.domain.ExamTable;
import com.brightflag.domain.Student;
import com.brightflag.domain.SubjectTable;
import com.brightflag.service.ExamService;
import com.brightflag.service.ExamTableService;
import com.brightflag.service.StudentService;
import com.brightflag.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ExamTableController {
    @Autowired
    private StudentService studentService;

    @Autowired
    private SubjectService subjectService;

    @Autowired
    private ExamService examService;

    @Autowired
    private ExamTableService examTableService;


    @RequestMapping("/getExamTables")
    public String getExamTables(){

        //get all data from SubjectTable
        List<SubjectTable> subjectTables = subjectService.getSubjectTableList();


        return "exam";
    }


    @RequestMapping("/getExamByExamID")
    public String getExamByExamID(@RequestParam("examID") String examID, Model model){
        List<Student> studentList = studentService.getStudents();
        model.addAttribute("studentList",studentList);

        List<Exam> examList = examService.getAllExams();
        model.addAttribute("examList",examList);
        System.out.println(examID);
        if(examID.equals("Please Select Exam")){
            model.addAttribute("error","Please Select a examID first");
            return "exam";
        }
        List<ExamTable> examTableList = examTableService.getExamByExamID(Integer.valueOf(examID));
        model.addAttribute("examTables",examTableList);
        return "exam";
    }

    @RequestMapping("/getExamByStudentID")
    public String getExamByStudentID(@RequestParam("studentID") String studentID, Model model){
        List<Student> studentList = studentService.getStudents();
        model.addAttribute("studentList",studentList);

        List<Exam> examList = examService.getAllExams();
        model.addAttribute("examList",examList);
        if(studentID.equals("Please Select Student")){
            model.addAttribute("error","Please Select a StudentID first");
            return "exam";
        }

        List<ExamTable> examTableList = examTableService.getExamByStudentID(Integer.valueOf(studentID));



        model.addAttribute("examTables",examTableList);
        return "exam";
    }
}
