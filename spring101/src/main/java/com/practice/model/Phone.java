package com.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Phone {

	public enum PhoneNumberType {
		MOBILE_HOME, MOBILE_WORK, LANDLINE_HOME, LANDLINE_WORK
	}

	@Id
	@Column(name = "PHONE_NUMBER")
	private String number;

	@Column(name = "PHONE_TYPE")
	@Enumerated(EnumType.STRING)
	private PhoneNumberType type;
	@ManyToOne
	@JoinColumn(name = "EID")
	private Employee employee;

	public PhoneNumberType getType() {
		return type;
	}

	public void setType(PhoneNumberType type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "PhoneNumber [type=" + type + ", number=" + number + "]";
	}

}
