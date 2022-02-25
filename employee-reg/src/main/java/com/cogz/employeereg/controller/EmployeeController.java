package com.cogz.employeereg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogz.employeereg.model.Employee;
import com.cogz.employeereg.service.EmployeeService;

@CrossOrigin(origins = "http://localhost:8000")
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		List<Employee> employees = employeeService.getAllEmployees();
		return new ResponseEntity<>(employees, HttpStatus.OK);
	}
	
	@PostMapping("/addEmployee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		List<Employee> employees = employeeService.getAllEmployees();
		for(Employee emp : employees) {
			if(emp.getId() == employee.getId()) {
				return new ResponseEntity<Employee>(emp, HttpStatus.FOUND);
				
			}
		}
		employeeService.saveEmployee(employee);
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(employee.getId()), HttpStatus.CREATED);
	}
	
	@GetMapping("/getEmployee/{id}")
	public ResponseEntity<Employee> getEmployeeInfo(@PathVariable("id") Integer id){
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(id), HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Employee> updateTodo(@PathVariable("id") Integer id, @RequestBody Employee employee) {
        employeeService.updateEmployee(id, employee);
        return new ResponseEntity<>(employeeService.getEmployeeById(id), HttpStatus.OK);
    }
}
