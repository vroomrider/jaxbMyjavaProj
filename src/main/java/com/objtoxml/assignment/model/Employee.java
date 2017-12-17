package com.objtoxml.assignment.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "employee")
public class Employee {

	@XmlAttribute
	private int id;

	private String name;

	private double salary;

	/**
	 * TODO: Try to use this as a SET and try with Array
	 */
	@XmlElementWrapper(name = "employee-address")
	private List<Address> address;

	@XmlElementWrapper(name = "phone-numbers")
	@XmlElement(name = "numbers")
	private List<Long> phoneNumbers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public List<Long> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<Long> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", Address=" + address
				+ ", phoneNumbers=" + phoneNumbers + "]";
	}

}
