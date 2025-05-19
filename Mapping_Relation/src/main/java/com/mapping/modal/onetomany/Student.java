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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ref_stonetomany")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer student_id;
	private String name;
	private String mobile;
	
	@OneToOne(mappedBy = "student")
	private Branch branch;
	
	 @OneToMany(mappedBy = "students")
	 private List<Tablet> tablet;
	
	@OneToOne(mappedBy = "student")
	private College college;

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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public List<Tablet> getTablet() {
		return tablet;
	}

	public void setTablet(List<Tablet> tablet) {
		this.tablet = tablet;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public Student(Integer student_id, String name, String mobile, Branch branch, List<Tablet> tablet,
			College college) {
		super();
		this.student_id = student_id;
		this.name = name;
		this.mobile = mobile;
		this.branch = branch;
		this.tablet = tablet;
		this.college = college;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", name=" + name + ", mobile=" + mobile + ", branch=" + branch
				+ ", tablet=" + tablet + ", college=" + college + "]";
	}
	
}
