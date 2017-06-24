package com.practice.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.practice.dao.EmployeeDao;
import com.practice.model.Employee;

@Repository("JPAEmployeeDAO")
public class EmployeeDAOImpl implements EmployeeDao {

	@PersistenceContext
	EntityManager entityManager;
	
	
	@Override
	@Transactional(isolation=Isolation.REPEATABLE_READ)
	public Employee getEmployee(String id) {
		Employee employee = entityManager.find(Employee.class, id);
		return employee;
	}

}
