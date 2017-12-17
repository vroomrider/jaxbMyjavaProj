package com.objtoxml.googlemaps.model.boundary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "geometry")
@XmlAccessorType(XmlAccessType.FIELD)
public class Geometry {

	private Location location;

	@XmlElement(name = "location_type")
	private String locationType;

	private ViewPort viewport;

	private Bounds bounds;

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getLocationType() {
		return locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	public ViewPort getViewport() {
		return viewport;
	}

	public void setViewport(ViewPort viewport) {
		this.viewport = viewport;
	}

	public Bounds getBounds() {
		return bounds;
	}

	public void setBounds(Bounds bounds) {
		this.bounds = bounds;
	}

	@Override
	public String toString() {
		return "Geometry [location=" + location + ", locationType=" + locationType + ", viewport=" + viewport
				+ ", bounds=" + bounds + "]";
	}
}
