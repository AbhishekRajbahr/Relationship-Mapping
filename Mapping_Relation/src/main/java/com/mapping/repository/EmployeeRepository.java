package com.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.modal.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>
{

}
