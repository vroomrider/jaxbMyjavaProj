package com.objtoxml.assignment;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.jspiders.myjavaproj.company.fromsxd.GetCompany;
import com.objtoxml.assignment.model.Company;

public class CompanyObjToXml {

	public static void main(String[] args) throws JAXBException {

		Company company = GetCompany.getData();
		JAXBContext jaxCon = JAXBContext.newInstance(Company.class);
		Marshaller marshaller = jaxCon.createMarshaller();
		marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(company, System.out);
	}
}
