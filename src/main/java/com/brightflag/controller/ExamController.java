package com.brightflag.controller;


import com.brightflag.domain.Exam;
import com.brightflag.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ExamController {
    @Autowired
    private ExamService examService;



    @RequestMapping(value = "getAllExams")
    public String getAllExams(){
        List<Exam> examList = examService.getAllExams();
        for(Exam exam : examList){
            System.out.println(exam.getExamName());
        }
        return "exam";
    }

}
