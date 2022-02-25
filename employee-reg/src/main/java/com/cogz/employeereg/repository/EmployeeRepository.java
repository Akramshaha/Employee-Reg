package com.cogz.employeereg.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cogz.employeereg.model.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
