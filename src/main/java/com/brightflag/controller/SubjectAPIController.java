package com.brightflag.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.brightflag.service.SubjectService;

@RestController
public class SubjectAPIController {

	@Autowired
	SubjectService subjectService;


}
