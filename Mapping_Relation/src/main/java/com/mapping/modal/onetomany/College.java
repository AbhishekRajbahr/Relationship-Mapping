package com.mapping.modal.onetomany;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ref_college")
public class College {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer clg_id;
	private String clg_name;
	
	@OneToOne
	@JoinColumn(name="student_id")
	private Student student;

	public Integer getClg_id() {
		return clg_id;
	}

	public void setClg_id(Integer clg_id) {
		this.clg_id = clg_id;
	}

	public String getClg_name() {
		return clg_name;
	}

	public void setClg_name(String clg_name) {
		this.clg_name = clg_name;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public College(Integer clg_id, String clg_name, Student student) {
		super();
		this.clg_id = clg_id;
		this.clg_name = clg_name;
		this.student = student;
	}

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "College [clg_id=" + clg_id + ", clg_name=" + clg_name + ", student=" + student + "]";
	}
	
	
}
