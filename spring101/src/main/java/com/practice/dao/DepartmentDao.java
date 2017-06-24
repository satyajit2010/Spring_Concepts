package com.practice.dao;

import java.util.List;

import com.practice.model.Employee;

public interface DepartmentDao {

	List<Employee> getAllEmployees(String deptId);

}
