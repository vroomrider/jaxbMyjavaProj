package com.jspiders.myjavaproj.companystandard.college.fromsxd;

import java.util.ArrayList;
import java.util.List;

import com.jspiders.myjavaproj.companystandard.college.fromsxd.College.StudentList;

public class GenerateData {

	public static College generate() {

		/**
		 * @Renaming
		 */
		Student student = new Student();
		student.setRegNum(100);
		student.setFirstName("Pradeep");
		student.setLastName("Naik");

		Student student2 = new Student();
		student2.setRegNum(100);
		//student2.setFirstName("Pradeep");
		student2.setLastName("Naik");

		/**
		 * @Comment & use the StudentList
		 */
		// List<Student> studList = new ArrayList<>();
		// studList.add(student);
		// studList.add(student2);

		College col = new College();
		col.setCollegeName("Jspders");

		StudentList studList = new StudentList();
		studList.getStudentInfo().add(student);
		studList.getStudentInfo().add(student2);

		col.setStudentList(studList);

		return col;
	}
}
