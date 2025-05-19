package com.mapping.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.mapping.modal.onetomany.*;
import com.mapping.repository.StudentRepository;
@RestController
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;
	
	@RequestMapping(value="/studen/save",method = RequestMethod.POST)
	public Student student_save(@RequestBody Student Student)
	{
		return studentRepository.save(Student)	;
	}
}
