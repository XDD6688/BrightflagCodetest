package com.brightflag.controller;


import com.brightflag.domain.Student;
import com.brightflag.domain.Subject;
import com.brightflag.service.StudentService;
import com.brightflag.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AddSubjectController {
    @Autowired
    private StudentService studentService;

    @Autowired
    private SubjectService subjectService;

    @PostMapping("/addSubjectToStudent")
    public String doAddSubjectToStudent(
            @RequestParam("studentID") Integer studentID,
            @RequestParam("subjectID") Integer subjectID,
            HttpServletRequest httpServletRequest,
            Model model
    ){
        List<Subject> subjectList = subjectService.getSubjectList();
        model.addAttribute("subjectList",subjectList);
        model.addAttribute("studentID",studentID);
        model.addAttribute("subjectID",subjectID);
        if(studentID == null || subjectID == null){
            model.addAttribute("error","Please enter the StudentID or SubjectID");
            return "add";
        }

        ArrayList<Integer> studentIdList = new ArrayList<>();
        ArrayList<Integer> subjectIdList = new ArrayList<>();
        List<Student> studentList = studentService.getStudents();
        for(Student student : studentList){
            studentIdList.add(student.getStudentID());
        }
        for(Subject subject : subjectList){
            subjectIdList.add(subject.getSubjectID());
        }
        if(studentIdList.contains(studentID)!=true || subjectIdList.contains(subjectID)!=true){
            model.addAttribute("error","Please enter correct StudentID or SubjectID");
            return "add";
        }


        Subject subject = subjectService.getSubject(subjectID);
        Student student = studentService.getStudentById(studentID);
        model.addAttribute("studentID",studentID);
        model.addAttribute("subjectID",subjectID);
        studentService.addSubject(student.getStudentID(),subject.getSubjectID(),subject.getSubjectName());
        return "redirect:/";
    }
}
