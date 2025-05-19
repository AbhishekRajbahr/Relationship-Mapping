package com.mapping.repository;

import org.springframework.data.repository.CrudRepository;

import com.mapping.modal.onetomany.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

}
