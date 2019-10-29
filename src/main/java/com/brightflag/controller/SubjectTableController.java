package com.brightflag.controller;


import com.brightflag.domain.Student;
import com.brightflag.domain.Subject;
import com.brightflag.domain.SubjectTable;
import com.brightflag.service.StudentService;
import com.brightflag.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Controller
public class SubjectTableController {
    @Autowired
    private StudentService studentService;

    @Autowired
    private SubjectService subjectService;

    @RequestMapping("/getSubjectListOfStudent")
    public List<SubjectTable> getSubjectListOfStudent(Integer studentID){
        System.out.println("这个已经执行了");
        System.out.println(studentID);
        List<SubjectTable> subjectTables = subjectService.getSubjectListOfStudent(studentID);
//        model.addAttribute("subjectTables",subjectTables);
        for(SubjectTable subjectTable:subjectTables){
            System.out.println(subjectTable.getSubjectName());
        }
        System.out.println("-------");
        return subjectTables;
    }

}
