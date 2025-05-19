package com.mapping.modal.onetomany;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ref_stubranch")
public class Branch {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer branch_id;
	private String cource;
	private Integer roll;
	
	@OneToOne
	@JoinColumn(name="student_id")
	private Student student;

	public Integer getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(Integer branch_id) {
		this.branch_id = branch_id;
	}

	public String getCource() {
		return cource;
	}

	public void setCource(String cource) {
		this.cource = cource;
	}

	public Integer getRoll() {
		return roll;
	}

	public void setRoll(Integer roll) {
		this.roll = roll;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Branch(Integer branch_id, String cource, Integer roll, Student student) {
		super();
		this.branch_id = branch_id;
		this.cource = cource;
		this.roll = roll;
		this.student = student;
	}

	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Branch [branch_id=" + branch_id + ", cource=" + cource + ", roll=" + roll + ", student=" + student
				+ "]";
	}
	
	
}
