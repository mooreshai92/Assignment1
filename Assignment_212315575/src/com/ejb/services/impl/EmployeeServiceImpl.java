package com.ejb.services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.*;

import com.ejb.services.EmployeeService;
import com.jpa.entities.Employee;

@Stateless
public class EmployeeServiceImpl implements EmployeeService {

	@PersistenceContext(name = "EmployeeApp")
	private EntityManager em;

	@Override
	public void addEmployee(Employee emp) {

		em.persist(emp);
	}
	@Override
    public List<Employee> getEmployees() throws Exception {
        Query query = em.createQuery("SELECT m FROM Employee as m");
        List<Employee> resultList = query.getResultList();
		return resultList;
    }

}