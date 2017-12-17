package com.objtoxml.assignment.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Address {

	@XmlAttribute
	private String type;

	@XmlElement(name = "house-number")
	private int houseNumber;

	@XmlElement(name = "address-1")
	private String address1;

	@XmlElement(name = "address-2")
	private String address2;

	private String landmark;

	private long pincode;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [type=" + type + ", houseNumber=" + houseNumber + ", address1=" + address1 + ", address2="
				+ address2 + ", landmark=" + landmark + ", pincode=" + pincode + "]";
	}

}
