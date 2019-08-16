package com.test.dependency;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class Test1 {

	@Test
	public void test() {
		assertTrue(true);
	}
	
    private final String USER_AGENT = "Mozilla/5.0";
    @Test
    public void test4() throws IOException
    {

		String url = "http://www.google.com";
		
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		//add request header
		con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
			System.out.println(inputLine);
		}
		in.close();

        if(response.length()>0)
        	assertTrue(true);
        else
        	assertFalse(false);
    }

}
