package com.mapping.modal.onetomany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="ref_table")
public class Tablet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer tablet_id;
	private String name;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="student_id")
	private Student  students;

	public Integer getTablet_id() {
		return tablet_id;
	}

	public void setTablet_id(Integer tablet_id) {
		this.tablet_id = tablet_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student getStudents() {
		return students;
	}

	public void setStudents(Student students) {
		this.students = students;
	}

	public Tablet(Integer tablet_id, String name, Student students) {
		super();
		this.tablet_id = tablet_id;
		this.name = name;
		this.students = students;
	}

	public Tablet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Tablet [tablet_id=" + tablet_id + ", name=" + name + ", students=" + students + "]";
	}
	
	
}
