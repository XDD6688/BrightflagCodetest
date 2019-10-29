package com.brightflag.repository;


import com.brightflag.domain.ExamTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ExamTableRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;


    public void addExamTable(Integer studentID, String firsName, String lastName, Integer examID, String examName) {
        jdbcTemplate.update("INSERT INTO examTable VALUES (?,?,?,?,?,?)",null,studentID,firsName,lastName,examID,examName);
    }

    public List<ExamTable> getExamTables() {
        return jdbcTemplate.query("SELECT * FROM examTable",new BeanPropertyRowMapper<ExamTable>(ExamTable.class));
    }

    public int clear() {
        return jdbcTemplate.update("DELETE  FROM examTable");
    }

    public List<ExamTable> getExamByExamID(Integer examID) {
        return jdbcTemplate.query("SELECT * FROM examTable WHERE examID = ?",new BeanPropertyRowMapper<ExamTable>(ExamTable.class),examID);
    }

    public List<ExamTable> getExamByStudentID(Integer studentID) {
        return jdbcTemplate.query("SELECT * FROM examTable WHERE studentID = ?",new BeanPropertyRowMapper<ExamTable>(ExamTable.class),studentID);
    }
}
