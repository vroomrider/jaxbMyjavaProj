package com.objtoxml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "college")
@XmlAccessorType(XmlAccessType.FIELD)
public class College {

	@XmlElement(name = "college-name")
	private String collegeName;

	@XmlElement(name = "Student-Info")
	@XmlElementWrapper(name = "Student-List")
	private List<Student> studentsList;

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public List<Student> getStudentsList() {
		return studentsList;
	}

	public void setStudentsList(List<Student> studentsList) {
		this.studentsList = studentsList;
	}

	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", studentsList=" + studentsList + "]";
	}

}
