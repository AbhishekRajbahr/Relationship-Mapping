package com.mapping.modal.manytomany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Studentt {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer student_id;
	private String name;
	
	 @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(
	        name = "student_courses",
	        joinColumns = @JoinColumn(name = "student_id"),
	        inverseJoinColumns = @JoinColumn(name = "cource_id")
	    )
	private List<Cource> cource;

	public Integer getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Cource> getCource() {
		return cource;
	}

	public void setCource(List<Cource> cource) {
		this.cource = cource;
	}

	public Studentt(Integer student_id, String name, List<Cource> cource) {
		super();
		this.student_id = student_id;
		this.name = name;
		this.cource = cource;
	}

	public Studentt() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Studentt [student_id=" + student_id + ", name=" + name + ", cource=" + cource + "]";
	}

	
	
	
}
