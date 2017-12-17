package com.objtoxml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JaxbMarshallingExample {

	public static void main(String[] args) throws JAXBException {

		/**
		 * Create a Student Object
		 */
		Student student = new Student();
		student.setRegno(100);
		student.setFirstname("Pradeep");
		student.setLastname("Naik");

		/**
		 * Convert above java object to xml
		 */
		JAXBContext jabctxx = JAXBContext.newInstance(Student.class);
		Marshaller mashalla = jabctxx.createMarshaller();
		mashalla.setProperty(mashalla.JAXB_FORMATTED_OUTPUT, true);
		mashalla.marshal(student, System.out);
		mashalla.marshal(student, new File("/home/hacker/student.xml"));

	}// End of Main

}// End of Class
