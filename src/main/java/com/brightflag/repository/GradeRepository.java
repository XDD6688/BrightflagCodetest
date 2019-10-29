package com.brightflag.repository;


import com.brightflag.domain.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GradeRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Grade> getAllGrades() {
        return jdbcTemplate.query("SELECT * FROM grade",new BeanPropertyRowMapper<Grade>(Grade.class));
    }

    public void addGrades(Integer studentID, String lastName, Integer examID, String examName, Integer grade) {
        jdbcTemplate.update("INSERT INTO grade VALUES(?,?,?,?,?,?)",null,studentID,lastName,examID,examName,grade);
    }

    public void clear() {
        jdbcTemplate.update("DELETE FROM grade");

    }

    public List<Grade> getGradeByExamID(Integer examID){
        return jdbcTemplate.query("SELECT * FROM grade WHERE examID = ?",new BeanPropertyRowMapper<Grade>(Grade.class),examID);
    }

    public List<Grade> getGradeByStudentID(Integer studentID) {
        return jdbcTemplate.query("SELECT * FROM grade WHERE studentID = ?", new BeanPropertyRowMapper<Grade>(Grade.class),studentID);
    }
}
