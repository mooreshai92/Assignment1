package com.ejb.services;

import java.util.ArrayList;
import java.util.List;

import com.jpa.entities.*;

public interface EmployeeService {

	public void addEmployee(Employee emp);
	public List<Employee> getMovies() throws Exception;
	
}
