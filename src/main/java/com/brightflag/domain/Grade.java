package com.brightflag.domain;

public class Grade {

	private Integer studentID;
	private String lastName;
	private Integer examID;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private String examName;
	private Integer grade;

	public Integer getStudentID() {
		return studentID;
	}

	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public Integer getExamID() {
		return examID;
	}

	public void setExamID(Integer examID) {
		this.examID = examID;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	@Override
	public String toString() {
		return "Grade [examID=" + examID + ", examName=" + examName + "]";
	}

}
