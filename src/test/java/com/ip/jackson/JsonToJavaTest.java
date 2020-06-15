package com.ip.jackson;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.ip.jackson.JsonToJava;
import com.ip.model.Employee;

public class JsonToJavaTest {
	private JsonToJava jsontojava; 
	
	@BeforeTest
	public void setUp() {
		jsontojava = new JsonToJava();
	}
	
	@Test
	public void convertJsonToJava() throws JsonParseException, JsonMappingException, IOException {
		
		String str = "employee.json";
		Employee emp = jsontojava.convertJava(str);
		Assert.assertEquals(emp.getFirstName(), "Pratap");
		Assert.assertEquals(emp.getLastName(), "Sahoo");
		Assert.assertEquals(emp.getDateOfBirth(), "30/12/1993");
		Assert.assertEquals(emp.getAddress(), "DGP");
		Assert.assertEquals(emp.getCity(), "Bhubenswar");
		Assert.assertEquals(emp.getState(), "Odisha");
	}
	
	@Test
	public void passingNull() throws JsonParseException, JsonMappingException, IOException {
		String str = null;
		Employee emp = jsontojava.convertJava(str);
		Assert.assertEquals(emp, null);
		
	}
}
