package com.cogz.employeereg.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cogz.employeereg.model.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer>{

}
