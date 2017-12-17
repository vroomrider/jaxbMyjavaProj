package com.objtoxml.googlemaps.model.boundary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Bounds {

	@XmlElement(name = "northeast")
	private NorthEast northEast;

	@XmlElement(name = "southwest")
	private SouthWest southWest;

	public NorthEast getNorthEast() {
		return northEast;
	}

	public void setNorthEast(NorthEast northEast) {
		this.northEast = northEast;
	}

	public SouthWest getSouthWest() {
		return southWest;
	}

	public void setSouthWest(SouthWest southWest) {
		this.southWest = southWest;
	}

	@Override
	public String toString() {
		return "Bounds [northEast=" + northEast + ", southWest=" + southWest + "]";
	}

}
