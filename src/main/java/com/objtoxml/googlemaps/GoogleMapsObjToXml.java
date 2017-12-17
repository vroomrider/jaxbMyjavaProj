package com.objtoxml.googlemaps;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.objtoxml.googlemaps.model.GeocodeResponse;

public class GoogleMapsObjToXml {

	public static void main(String[] args) throws JAXBException {

		GeocodeResponse geoCodeResponse = GetGoogleMapsData.getGeocodeResponse();
		JAXBContext jaxbCon = JAXBContext.newInstance(GeocodeResponse.class);
		Marshaller marshaller = jaxbCon.createMarshaller();
		marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(geoCodeResponse, System.out);

	}
}
