package com.jspiders.schema.college.validation;

import java.io.File;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import com.jspiders.myjavaproj.companystandard.college.fromsxd.College;
import com.jspiders.myjavaproj.companystandard.college.fromsxd.GenerateData;

public class JaxbSchemaValidationExample {

	public static void main(String[] args) throws Exception {

		String xsd = "/home/hacker/Web services/College.xsd";
		SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema schema = sf.newSchema(new File(xsd));

		JAXBContext jc = JAXBContext.newInstance(College.class);
		Marshaller mashalla = jc.createMarshaller();
		mashalla.setSchema(schema);
		mashalla.setProperty(mashalla.JAXB_FORMATTED_OUTPUT, true);
		mashalla.marshal(GenerateData.generate(), System.out);

	}// End fo main
}// End of class
