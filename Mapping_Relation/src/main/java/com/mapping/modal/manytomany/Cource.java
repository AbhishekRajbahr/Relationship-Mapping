package com.mapping.modal.manytomany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="cource")
public class Cource {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cource_id;
	private String  cource_name;
	
	@ManyToMany(mappedBy = "cource",cascade = CascadeType.ALL)
	private List<Studentt> student;

	public Integer getCource_id() {
		return cource_id;
	}

	public void setCource_id(Integer cource_id) {
		this.cource_id = cource_id;
	}

	public String getCource_name() {
		return cource_name;
	}

	public void setCource_name(String cource_name) {
		this.cource_name = cource_name;
	}

	public List<Studentt> getStudent() {
		return student;
	}

	public void setStudent(List<Studentt> student) {
		this.student = student;
	}

	public Cource(Integer cource_id, String cource_name, List<Studentt> student) {
		super();
		this.cource_id = cource_id;
		this.cource_name = cource_name;
		this.student = student;
	}

	public Cource() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cource [cource_id=" + cource_id + ", cource_name=" + cource_name + ", student=" + student + "]";
	}
	
	
	
	
	
}
