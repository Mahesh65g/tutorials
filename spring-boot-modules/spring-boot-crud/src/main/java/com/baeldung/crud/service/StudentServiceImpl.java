package com.baeldung.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.baeldung.crud.dao.StudentDao;
import com.baeldung.crud.entities.Student;

@Service("StudentServiceImpl")
public class StudentServiceImpl implements StudentService{
	
	
	@Autowired
	@Qualifier("StudentDaoIml")
	private StudentDao studentDao;

	@Override
	public void saveStudentInfo(Student reqDto) {
		
		studentDao.saveStudentData(reqDto);
		
		// TODO Auto-generated method stub
		
	}

}
