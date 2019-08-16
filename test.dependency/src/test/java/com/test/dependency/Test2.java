package com.test.dependency;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class Test2 {

	@Test
	public void test() {
		assertTrue(true);
	}
	
	@Test
	public void test2() {
		assertEquals(10, Calculator.sum(5, 5),0);
	}
	
	
	@Test
	public void test3() {
		assertEquals(2, Calculator.subtract(3, 2),0.5 );
	}
	
 

}
