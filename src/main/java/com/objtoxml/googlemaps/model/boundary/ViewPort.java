package com.objtoxml.googlemaps.model.boundary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class ViewPort {

	private NorthEast northEast;

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
		return "ViewPort [northEast=" + northEast + ", southWest=" + southWest + "]";
	}
}
