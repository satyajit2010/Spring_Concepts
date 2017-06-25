package com.practice.jpa.dao;

import org.springframework.stereotype.Repository;

import com.practice.dao.EmployeeDao;
import com.practice.model.Employee;

@Repository("JPAEmployeeDAO")
public class EmployeeDAOImpl extends JPABaseDao<Employee, String> implements EmployeeDao {

	@Override
	public Employee getEmployee(String id) {
		return get(id);
	}

	

}
