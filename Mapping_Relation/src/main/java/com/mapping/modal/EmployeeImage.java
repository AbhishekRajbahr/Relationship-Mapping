package com.mapping.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employeeimage")
public class EmployeeImage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String fileName;
	private String fileType;
	private String filePath;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public EmployeeImage(Long id, String fileName, String fileType, String filePath) {
		super();
		this.id = id;
		this.fileName = fileName;
		this.fileType = fileType;
		this.filePath = filePath;
	}
	public EmployeeImage() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmployeeImage [id=" + id + ", fileName=" + fileName + ", fileType=" + fileType + ", filePath="
				+ filePath + "]";
	}
	
}
