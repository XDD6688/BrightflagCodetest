package com.brightflag.domain;

public class SubjectTable {

    private Integer studentSubjectID;
    private Integer StudentID;
    private Integer SubjectID;
    private String SubjectName;

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String subjectName) {
        SubjectName = subjectName;
    }


    public Integer getStudentSubjectID() {
        return studentSubjectID;
    }

    public void setStudentSubjectID(Integer studentSubjectID) {
        this.studentSubjectID = studentSubjectID;
    }

    public Integer getStudentID() {
        return StudentID;
    }

    public void setStudentID(Integer studentID) {
        StudentID = studentID;
    }

    public Integer getSubjectID() {
        return SubjectID;
    }

    public void setSubjectID(Integer subjectID) {
        SubjectID = subjectID;
    }
}
