package com.jspiders.myjavaproj.restclient.txtlocal;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class TextLocalSendSmsRestClient {

	public static final String APIKEY = "HmU7MA9Pqo4-d7L3NZfyKQy6eraX9ZZsO6SjBUdJ1y";
	public static final Long PHNO = 919632437341L;
	public static final String MSG = "Hi,PradeepNaikR!!!+-ByTextLocal!";
	public static final String SENDERNAME = "TXTLCL";

	public static void main(String[] args) {

		StringBuilder url = new StringBuilder("https://api.textlocal.in/send/");
		url.append("?apikey=" + APIKEY);
		url.append("&message=" + MSG);
		url.append("&sender=" + SENDERNAME);
		url.append("&numbers=" + PHNO);

		System.out.println(url.toString());

		// 1st Step Create a new Client
		Client client = ClientBuilder.newClient();

		// 2nd Step get the Target
		WebTarget target = client.target(url.toString());

		// 3rd Invoke a Request
		Response response = target.request().get();

		// 4th Get the Entity from Response
		String output = (String) response.readEntity(String.class);
		System.out.println(output);

		// 5th
		// Don't Wait Execute!

	}// End
		// of
		// Main
}// End of Class