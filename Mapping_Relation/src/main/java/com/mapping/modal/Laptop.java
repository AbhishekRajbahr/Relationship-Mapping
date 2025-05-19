package com.mapping.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ref_laptop")
public class Laptop {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer laptop_id;
	private Integer price;
	private String lap_name;
	
	@OneToOne
	@JoinColumn(name="student_id")
	private Students student;
}
