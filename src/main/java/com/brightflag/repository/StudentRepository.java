package com.brightflag.repository;

import java.util.List;

import com.brightflag.domain.Subject;
import com.brightflag.domain.SubjectTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.brightflag.domain.Student;

@Repository
public class StudentRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Student> getStudents() {
		return jdbcTemplate.query("SELECT studentID, firstName, lastName FROM student;",
				new BeanPropertyRowMapper<Student>(Student.class));
	}

	public List<Subject> getSubjects(){
		return jdbcTemplate.query("SELECT subjectID,subjectName FROM subject WHERE subjectID=1",new BeanPropertyRowMapper<Subject>(Subject.class));
	}

	public void addSubject(Integer studentId, Integer subjectId, String subjectName) {
		jdbcTemplate.update("INSERT into subjectTable VALUES (?,?,?,?)",null,studentId,subjectId,subjectName);
	}

	public List<SubjectTable> getSubjectTable() {
		return jdbcTemplate.query("SELECT * FROM subjectTable",new BeanPropertyRowMapper<SubjectTable>(SubjectTable.class));
	}

	public List<SubjectTable> showALL() {
		return jdbcTemplate.query("SELECT * FROM subjectTable",new BeanPropertyRowMapper<SubjectTable>(SubjectTable.class));
	}

	public Student getstudentById(Integer studentID) {
		return jdbcTemplate.queryForObject("SELECT * FROM student WHERE studentID=?",new BeanPropertyRowMapper<Student>(Student.class),studentID);
	}
}
