package com.objtoxml.googlemaps.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.objtoxml.googlemaps.model.boundary.Geometry;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Result {

	private List<String> type;

	@XmlElement(name = "formatted_address")
	private String formattedAddress;

	@XmlElement(name = "address_component")
	private List<AddressComponent> addressComponent;

	private Geometry geometry;

	@XmlElement(name = "partial_match")
	private Boolean partialMatch;

	@XmlElement(name = "place_id")
	private String placeId;

	public List<String> getType() {
		return type;
	}

	public void setType(List<String> type) {
		this.type = type;
	}

	public String getFormattedAddress() {
		return formattedAddress;
	}

	public void setFormattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
	}

	public List<AddressComponent> getAddressComponent() {
		return addressComponent;
	}

	public void setAddressComponent(List<AddressComponent> addressComponent) {
		this.addressComponent = addressComponent;
	}

	public Geometry getGeometry() {
		return geometry;
	}

	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}

	public Boolean getPartialMatch() {
		return partialMatch;
	}

	public void setPartialMatch(Boolean partialMatch) {
		this.partialMatch = partialMatch;
	}

	public String getPlaceId() {
		return placeId;
	}

	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}

	@Override
	public String toString() {
		return "Result [type=" + type + ", formattedAddress=" + formattedAddress + ", addressComponent="
				+ addressComponent + ", geometry=" + geometry + ", partialMatch=" + partialMatch + ", placeId="
				+ placeId + "]";
	}

}
