package com.mapping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mapping.modal.manytomany.Cource;
import com.mapping.modal.manytomany.Studentt;
import com.mapping.repository.CourceRepository;
import com.mapping.repository.StudenttManyRepository;

@Service
public class StudentService {

	@Autowired
	private StudenttManyRepository studenttManyRepository;

	@Autowired
	private CourceRepository courceRepository;

	public Studentt saveStudent(Studentt student) {
		for (Cource course : student.getCource()) {
            
            	courceRepository.save(course);
            
        }
        return studenttManyRepository.save(student);
	}
	 public Iterable<Studentt> getAllStudents() {
	        return studenttManyRepository.findAll();
	    }
	 
	  public Optional<Studentt> getStudentById(Integer id) {
	        return studenttManyRepository.findById(id);
	    }
}
