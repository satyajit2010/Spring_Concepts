package com.practice.jdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.dao.EmployeeDao;

public class JdbcApplication {
	private static final Logger LOG = LoggerFactory.getLogger(JdbcApplication.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:jdbc_example.xml");
		EmployeeDao employeeDao = applicationContext.getBean("JdbcEmployeeDao", EmployeeDao.class);
		System.out.println(employeeDao.getEmployee("1"));
	}
}
