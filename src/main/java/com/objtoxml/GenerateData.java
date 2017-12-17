package com.objtoxml;

import java.util.ArrayList;
import java.util.List;

public class GenerateData {

	public static College generate() {
		Student student = new Student();
		student.setRegno(100);
		student.setFirstname("Pradeep");
		student.setLastname("Naik");

		Student student2 = new Student();
		student2.setRegno(100);
		student2.setFirstname("Pradeep");
		student2.setLastname("Naik");

		List<Student> studList = new ArrayList();
		studList.add(student);
		studList.add(student2);

		College col = new College();
		col.setCollegeName("Jspders");
		col.setStudentsList(studList);

		return col;
	}
}
