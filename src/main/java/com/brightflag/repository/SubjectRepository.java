package com.brightflag.repository;

import com.brightflag.domain.Subject;
import com.brightflag.domain.SubjectTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class SubjectRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public Subject getSubject(Integer id){
        Subject subject = jdbcTemplate.queryForObject("SELECT subjectID,subjectName FROM subject WHERE subjectID=?",new BeanPropertyRowMapper<Subject>(Subject.class),id);
        return subject;
    }

    public List<Subject> getSubjectList() {
        return jdbcTemplate.query("SELECT * FROM subject",new BeanPropertyRowMapper<Subject>(Subject.class));
    }

    public List<SubjectTable> getSubjectListOfStudent(Integer studentID) {
        return jdbcTemplate.query("SELECT subjectName FROM subjectTable WHERE studentID = ?", new BeanPropertyRowMapper<SubjectTable>(SubjectTable.class),studentID);
    }

    public List<SubjectTable> getSubjectTableList() {
        return jdbcTemplate.query("SELECT * FROM subjectTable",new BeanPropertyRowMapper<SubjectTable>(SubjectTable.class));
    }
}
