package com.mapping.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ref_student")
public class Students {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer student_id;
	private String name;
	private String mobile;
	
	
	
}
