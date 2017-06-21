package com.practice.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.practice.jdbc.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public EmployeeDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public Employee getEmployee(String id) {
		Employee employee = this.jdbcTemplate.queryForObject("Select * FROM EMPLOYEE WHERE EID = ?",
				new Object[] { id }, new RowMapper<Employee>() {

					@Override
					public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
						Employee employee = new Employee();
						employee.setEid(rs.getString("EID"));
						employee.setFname(rs.getString("FNAME"));
						employee.setLname(rs.getString("LNAME"));
						employee.setSalary(rs.getBigDecimal("SALARY"));
						return employee;
					}
				});
		return employee;
	}

}
