package com.xmltoobj;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.objtoxml.College;

public class JaxBUnmarshallingExample1 {

	public static void main(String[] args) throws JAXBException {

		/**
		 * Jaxb converter from xml to Object
		 */
		JAXBContext jaxUnmarshall = JAXBContext.newInstance(College.class);
		Unmarshaller unmar = jaxUnmarshall.createUnmarshaller();
		Object obj = unmar.unmarshal(new File("college.xml"));
		College col = (College) obj;
		System.err.println(col.getCollegeName());
		col.getStudentsList().forEach(student -> {
			System.out.println(student);
		});
	}

}
