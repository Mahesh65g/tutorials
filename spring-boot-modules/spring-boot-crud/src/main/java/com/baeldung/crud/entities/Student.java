package com.baeldung.crud.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 
 * @author Mahesh.Golla
 *
 */

/*
 * This Class response for entity and entity fields
 */
@Entity
@Table(name = "STUDENT_INFO")
@Data
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "STUDENT_NAME")
	private String name;

	@Column(name = "STUDENT_CLASS")
	private String studentClass;

	@Column(name = "STUDENT_SECTION")
	private BigDecimal studentSection;

	@Column(name = "STUDENT_TERM_1")
	private String studentTerm1;

	@Column(name = "STUDENT_TERM_2")
	private String studentTerm2;

	@Column(name = "STUDENT_TERM_3")
	private String studentTerm3;

}
