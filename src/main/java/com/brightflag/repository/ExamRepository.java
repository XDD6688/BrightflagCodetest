package com.brightflag.repository;

import com.brightflag.domain.Exam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ExamRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Exam> getAllExams() {
		return jdbcTemplate.query("SELECT * FROM exam",new BeanPropertyRowMapper<Exam>(Exam.class));
	}
}
