package com.jspiders.myjavaproj.restclient;

public class TextLocalSendSmsRestClient {

	public static final String APIKEY = "HmU7MA9Pqo4-d7L3NZfyKQy6eraX9ZZsO6SjBUdJ1y";

	public static void main(String[] args) {

		Long phno = 919632437341L;
		String msg = "Hi, Pradeep Naik R!!!  - By TextLocal!";

		StringBuilder url = new StringBuilder("https://api.textlocal.in/send/");
		url.append("?apikey=" + APIKEY);
		url.append("&message="+ msg);
		url.append("&sender=" + "TXTLCL");
		url.append("&numbers=" + phno);
	}// End
		// of
		// Main
}// End of Class