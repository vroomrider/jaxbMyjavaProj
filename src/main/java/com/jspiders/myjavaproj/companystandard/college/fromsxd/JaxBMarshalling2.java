package com.jspiders.myjavaproj.companystandard.college.fromsxd;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JaxBMarshalling2 {
	public static void main(String[] args) throws JAXBException {
		/**
		 * @Get the data
		 * 
		 * @Initially we get @XmlRootElement missing Exception then add
		 *            the @XmlRootElement in college.java
		 */
		College col = GenerateData.generate();

		/**
		 * Convert java object to xml
		 */

		JAXBContext jabctxx = JAXBContext.newInstance(College.class);
		Marshaller mashalla = jabctxx.createMarshaller();
		mashalla.setProperty(mashalla.JAXB_FORMATTED_OUTPUT, true);
		mashalla.marshal(col, System.out);
		mashalla.marshal(col, new File("college.xml"));
	}
}
