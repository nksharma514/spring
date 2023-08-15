package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}



	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	
	@Override
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
	@Override
	public List<Employee> saveEmployees(List<Employee> employees){
		return employeeRepository.saveAll(employees);
	}
	
	@Override
	public Employee getEmployeeById(long id) {
		
//		Optional<Employee> employee =  employeeRepository.findById(id);
//		if(employee.isPresent()) {
//			return employee.get();
//		}else {
//			throw new ResourceNotFoundException("Employee", "id", id);
//		}
		
		return employeeRepository.findById(id).orElseThrow( ()-> 
										new ResourceNotFoundException("Employee", "id", id));
	}



	@Override
	public Employee updateEmployee(Employee employee, long id) {
		
		Employee existingEmployee = employeeRepository.findById(id).orElseThrow(
				()-> new ResourceNotFoundException("Employee", "id", id));
		
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		
		employeeRepository.save(existingEmployee);
		return existingEmployee;
	}
	
	
		

}
