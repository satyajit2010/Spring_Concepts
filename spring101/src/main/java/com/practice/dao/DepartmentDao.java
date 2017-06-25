package com.practice.dao;

import java.util.List;

import com.practice.model.Department;
import com.practice.model.Employee;

public interface DepartmentDao {

	List<Employee> getAllEmployees(Department dept);

	Department getDepartment(String deptId);

}
