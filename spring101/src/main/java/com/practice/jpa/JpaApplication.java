package com.practice.jpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.jdbc.dao.EmployeeDao;

public class JpaApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc_example.xml");
		EmployeeDao employeeDao = applicationContext.getBean("JPAEmployeeDAOImpl", EmployeeDao.class);
		System.out.println(employeeDao.getEmployee("1"));
	}
}
