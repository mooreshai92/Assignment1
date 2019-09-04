package com.gui.controllers;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.ejb.services.EmployeeService;
import com.jpa.entities.Employee;

@ManagedBean
public class EmployeeController {

	private Employee employee = new Employee();

	@EJB
	private EmployeeService service;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void saveEmployee(Employee emp) {
		service.addEmployee(emp);
	}
	
	public List<Employee> getEmployees(){
		try {
			return service.getEmployees();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}