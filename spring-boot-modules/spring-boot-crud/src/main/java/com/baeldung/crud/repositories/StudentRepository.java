package com.baeldung.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baeldung.crud.entities.Student;

/**
 * 
 * @author Mahesh.Golla
 *
 */
/*
 * This Repository tells the details of Student Informations
 */

@Repository("StudentRepository")
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public interface StudentRepository extends JpaRepository<Student, Long> {

}
