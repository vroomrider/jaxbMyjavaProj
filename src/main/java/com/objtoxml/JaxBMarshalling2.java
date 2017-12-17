package com.objtoxml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JaxBMarshalling2 {
	public static void main(String[] args) throws JAXBException {
		/**
		 * Get the data
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
