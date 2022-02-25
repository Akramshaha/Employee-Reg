package com.cogz.employeereg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogz.employeereg.model.Employee;
import com.cogz.employeereg.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		return employeeRepository.findById(id).get();
	}

	@Override
	public void updateEmployee(Integer id, Employee employee) {
		employeeRepository.save(employee);
	}

}
