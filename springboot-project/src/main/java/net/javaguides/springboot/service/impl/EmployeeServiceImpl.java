package net.javaguides.springboot.service.impl;


import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import net.javaguides.springboot.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements  EmployeeService{
 private EmployeeRepository employeerepository;
 


	public EmployeeServiceImpl(EmployeeRepository employeerepository) {
	super();
	this.employeerepository = employeerepository;
}



	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeerepository.save( employee);
	}



	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeerepository.findAll();
	}

}
