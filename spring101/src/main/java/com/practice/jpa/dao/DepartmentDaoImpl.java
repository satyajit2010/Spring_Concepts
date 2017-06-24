package com.practice.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.practice.dao.DepartmentDao;
import com.practice.model.Department;
import com.practice.model.Employee;

@Repository
public class DepartmentDaoImpl implements DepartmentDao {

	@PersistenceContext
	EntityManager entityManager;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	@Override
	public List<Employee> getAllEmployees(String deptId) {
		Department department = entityManager.find(Department.class, deptId);
		department.getEmployees().size(); // forced initialization
		return department.getEmployees();
	}

}
