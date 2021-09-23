package com.baeldung.crud.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.baeldung.crud.entities.Student;
import com.baeldung.crud.repositories.StudentRepository;

@Service("StudentDaoIml")
public class StudentDaoIml implements StudentDao {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(StudentDaoIml.class);

	@Autowired
	@Qualifier("StudentRepository")
	private StudentRepository studentRepository;

	@Override
	public void saveStudentData(Student reqDto) {
		try {
			studentRepository.save(reqDto);
			LOGGER.debug("Sucessfully Added data to DB");
		} catch (Exception e) {

			LOGGER.debug("failed data storing to DB" + e);
			new Exception(e);
		}
	}

}
