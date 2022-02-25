package com.cogz.employeereg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogz.employeereg.model.Department;
import com.cogz.employeereg.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public List<Department> getAllDepartments() {
		return (List<Department>) departmentRepository.findAll();
	}

}
