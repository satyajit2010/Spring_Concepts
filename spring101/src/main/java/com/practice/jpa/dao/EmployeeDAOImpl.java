package com.practice.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.practice.jdbc.dao.EmployeeDao;
import com.practice.jdbc.model.Employee;

@Repository
public class JPAEmployeeDAOImpl implements EmployeeDao {

	@PersistenceContext
	EntityManager entityManager;
	
	
	@Override
	@Transactional(isolation=Isolation.REPEATABLE_READ)
	public Employee getEmployee(String id) {
		Employee employee = entityManager.find(Employee.class, id);
		return employee;
	}

}
