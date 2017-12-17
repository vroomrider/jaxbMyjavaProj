package com.objtoxml.googlemaps.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class AddressComponent {

	@XmlElement(name = "long_name")
	private String longName;

	@XmlElement(name = "short_name")
	private String shortName;

	private List<String> type;

	public String getLongName() {
		return longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public List<String> getType() {
		return type;
	}

	public void setType(List<String> type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "AddressComponent [longName=" + longName + ", shortName=" + shortName + ", type=" + type + "]";
	}
}
