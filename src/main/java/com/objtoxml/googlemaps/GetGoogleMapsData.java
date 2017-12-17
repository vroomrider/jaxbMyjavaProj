package com.objtoxml.googlemaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.objtoxml.googlemaps.model.AddressComponent;
import com.objtoxml.googlemaps.model.GeocodeResponse;
import com.objtoxml.googlemaps.model.Result;
import com.objtoxml.googlemaps.model.boundary.Bounds;
import com.objtoxml.googlemaps.model.boundary.Geometry;
import com.objtoxml.googlemaps.model.boundary.Location;
import com.objtoxml.googlemaps.model.boundary.NorthEast;
import com.objtoxml.googlemaps.model.boundary.SouthWest;
import com.objtoxml.googlemaps.model.boundary.ViewPort;

public class GetGoogleMapsData {

	public static GeocodeResponse getGeocodeResponse() {

		List<String> type = new ArrayList<>();
		type.add("locality");
		type.add("political");

		AddressComponent ac = new AddressComponent();
		ac.setLongName("New York");
		ac.setShortName("New York");
		ac.setType(type);

		List<AddressComponent> acList = new ArrayList<>();
		acList.add(ac);
		acList.add(ac);
		acList.add(ac);

		/**
		 * @Location
		 */
		Location location = new Location();
		location.setLat(40.7127753);
		location.setLng(-74.005972);

		/**
		 * @Bounds
		 */
		NorthEast boundsNorthEast = new NorthEast();
		boundsNorthEast.setLat(40.9175771);
		boundsNorthEast.setLng(-73.7002721);

		SouthWest boundsSouthWest = new SouthWest();
		boundsSouthWest.setLat(40.4773991);
		boundsSouthWest.setLng(-74.2590899);

		Bounds bounds = new Bounds();
		bounds.setNorthEast(boundsNorthEast);
		bounds.setSouthWest(boundsSouthWest);

		/**
		 * @ViewPort
		 */
		NorthEast viewPortNorthEast = new NorthEast();
		viewPortNorthEast.setLat(40.9175771);
		viewPortNorthEast.setLng(-73.7002721);

		SouthWest viewPortSouthWest = new SouthWest();
		viewPortSouthWest.setLat(40.4773991);
		viewPortSouthWest.setLng(-74.2590899);

		ViewPort viewport = new ViewPort();
		viewport.setNorthEast(viewPortNorthEast);
		viewport.setSouthWest(viewPortSouthWest);

		/**
		 * @Geometry
		 */
		Geometry geometry = new Geometry();
		geometry.setLocation(location);
		geometry.setLocationType("APPROXIMATE");
		geometry.setBounds(bounds);
		geometry.setViewport(viewport);

		/**
		 * @Result
		 */
		Result result = new Result();
		result.setType(type);
		result.setFormattedAddress("New York, NY, USA");
		result.setAddressComponent(acList);
		result.setGeometry(geometry);
		result.setPartialMatch(true);
		result.setPlaceId("ChIJOwg_06VPwokRYv534QaPC8g");

		/**
		 * @GeocodeResponse
		 */
		GeocodeResponse gcr = new GeocodeResponse();
		gcr.setStatus("OK");
		gcr.setResult(result);

		return gcr;
	}
}
