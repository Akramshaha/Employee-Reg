package com.cogz.employeereg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogz.employeereg.model.Department;
import com.cogz.employeereg.service.DepartmentService;

@CrossOrigin(origins = "http://localhost:8000")
@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/getDepartments")
	public ResponseEntity<List<Department>> getAllDepartments(){
		List<Department> departments = departmentService.getAllDepartments();
		return new ResponseEntity<>(departments, HttpStatus.OK);
	}
}
