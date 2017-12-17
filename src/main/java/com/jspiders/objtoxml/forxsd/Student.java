package com.jspiders.objtoxml.forxsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "student-info")
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
	@XmlElement(name = "reg-num")
	private int regno;

	@XmlElement(name = "first-name")
	private String firstname;

	@XmlElement(name = "last-name")
	private String lastname;

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Student [regno=" + regno + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}
}
