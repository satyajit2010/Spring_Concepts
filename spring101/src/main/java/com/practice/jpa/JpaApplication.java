package com.practice.jpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.dao.DepartmentDao;
import com.practice.dao.EmployeeDao;
import com.practice.model.Employee;

public class JpaApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc_example.xml");
		EmployeeDao employeeDao = applicationContext.getBean("JPAEmployeeDAO", EmployeeDao.class);
		DepartmentDao departmentDao = applicationContext.getBean(DepartmentDao.class);
		Employee employee = employeeDao.getEmployee("e1");
		System.out.println(employee);
		System.out.println(departmentDao.getAllEmployees(employee.getDepartment()));
	}
}
