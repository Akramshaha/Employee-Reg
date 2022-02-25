package com.cogz.employeereg.service;

import java.util.List;
import java.util.Optional;

import com.cogz.employeereg.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();

	public void saveEmployee(Employee employee);

	public Employee getEmployeeById(Integer id);

	public void updateEmployee(Integer id, Employee employee);
}
