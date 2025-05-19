package com.mapping.repository;

import org.springframework.data.repository.CrudRepository;

import com.mapping.modal.manytomany.Studentt;

public interface StudenttManyRepository extends CrudRepository<Studentt, Integer>{

}
