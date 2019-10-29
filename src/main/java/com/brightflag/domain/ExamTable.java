package com.brightflag.domain;

public class ExamTable {
    private Integer ExamTableID;
    private Integer StudentID;
    private String FirsName;
    private String LastName;
    private Integer ExamID;
    private String ExamName;
    public Integer getExamTableID() {
        return ExamTableID;
    }

    public void setExamTableID(Integer examTableID) {
        ExamTableID = examTableID;
    }

    public Integer getStudentID() {
        return StudentID;
    }

    public void setStudentID(Integer studentID) {
        StudentID = studentID;
    }

    public String getFirsName() {
        return FirsName;
    }

    public void setFirsName(String firsName) {
        FirsName = firsName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Integer getExamID() {
        return ExamID;
    }

    public void setExamID(Integer examID) {
        ExamID = examID;
    }

    public String getExamName() {
        return ExamName;
    }

    public void setExamName(String examName) {
        ExamName = examName;
    }

}
