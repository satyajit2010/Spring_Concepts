package com.practice.jdbc.dao;

import com.practice.jdbc.model.Employee;

public interface EmployeeDao {
	Employee getEmployee(String id);
}
