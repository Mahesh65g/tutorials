package com.baeldung.crud.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.baeldung.crud.entities.Student;
import com.baeldung.crud.service.StudentService;
import com.google.gson.Gson;

/**
 * 
 * @author Mahesh.Golla
 *
 */
/*
 * This Controller response for taking the inputs as HTTP requsets Returning the
 * response as HTTP Responses This class make the combination of Requset Body
 * and Controller......
 */
@RestController
public class StudentController {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(StudentController.class);

	@Autowired
	@Qualifier("StudentServiceImpl")
	private StudentService studentService;

	@PostMapping(value = "/addStudentInfo", produces = {
			MediaType.APPLICATION_JSON_VALUE })

	public ResponseEntity<String> getStatus(@RequestBody String jsonReq) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("executing the processRefIds method in SaveToGstn");
		}
		Gson gson = new Gson();
		Student reqDto = gson.fromJson(jsonReq, Student.class);
		try {
			if (reqDto != null) {
				studentService.saveStudentInfo(reqDto);
				return new ResponseEntity<String>("Record Added SucessFully",
						HttpStatus.OK);
			} else {
				return new ResponseEntity<String>("Record Adding failed",
						HttpStatus.NOT_FOUND);
			}

		} catch (Exception e) {
			return new ResponseEntity<String>("Record Adding failed",
					HttpStatus.BAD_REQUEST);

		}
	}

}
