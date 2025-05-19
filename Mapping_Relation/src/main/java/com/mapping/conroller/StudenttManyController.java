package com.mapping.conroller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.modal.manytomany.Studentt;
import com.mapping.service.StudentService;

@RestController
public class StudenttManyController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/add")
    public Studentt addStudent(@RequestBody Studentt student) {
		
		return studentService.saveStudent(student);
    }
	@GetMapping("/all")
    public Iterable<Studentt> getAllStudents() {
        return studentService.getAllStudents();
    }
	
	@GetMapping("/{id}")
    public Optional<Studentt> getStudentById(@PathVariable Integer id) {
        return studentService.getStudentById(id);
    }
	
}
