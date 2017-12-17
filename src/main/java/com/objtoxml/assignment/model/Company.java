package com.objtoxml.assignment.model;

import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "company")
@XmlAccessorType(XmlAccessType.FIELD)
public class Company {

	@XmlElement(name = "company-name")
	private String companyName;

	@XmlElement(name = "info")
	private Map<String, Object> info;

	@XmlElementWrapper(name = "employee-list")
	@XmlElement(name = "employee")
	private List<Employee> employeeList;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Map<String, Object> getInfo() {
		return info;
	}

	public void setInfo(Map<String, Object> info) {
		this.info = info;
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", info=" + info + ", employeeList=" + employeeList + "]";
	}

}
