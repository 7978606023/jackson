package com.ip.jackson;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ip.jackson.JavaToJson;
import com.ip.model.Employee;

public class JavaToJsonTest {
	private JavaToJson javatojson; 
	
	@BeforeTest
	public void setUp(){
		 javatojson = new JavaToJson();
		
	}
	 @Test
	public void convertJavaToJson() throws IOException {
		 
		Employee em = new Employee();

		em.setFirstName("Pratap");
		em.setLastName("Sahoo");
		em.setDateOfBirth("30/12/1993");
		em.setAddress("BBSR");
		em.setCity("BBSR");
		em.setState("BBSR");
		
		String result = javatojson.convertJson(em);
		String expect = "[{  \"firstName\" : \"Pratap\",\n" + 
				"  \"dateOfBirth\" : \"30/12/1993\",\n" + 
				"  \"address\" : \"BBSR\",\n" + 
				"  \"city\" : \"BBSR\",\n" + 
				"  \"state\" : \"BBSR\",\n" + 
				"  \"lastName\" : \"Sahoo\"}]";
				
		Assert.assertNotEquals(result, expect);
		
	}

	@Test
	public void convertJavaToJsonPassingNullValues() throws IOException {
		Employee em = null;
		String actualResult = javatojson.convertJson(em);
		Assert.assertEquals(actualResult, "null");
	}

	@Test
	public void convertJavaToJsonPassingEmpty() throws IOException {
		Employee em = new Employee();;
		String actual = javatojson.convertJson(em);
		String expect = "{\n" + 
				"  \"firstName\" : null,\n" + 
				"  \"dateOfBirth\" : null,\n" + 
				"  \"address\" : null,\n" + 
				"  \"city\" : null,\n" + 
				"  \"state\" : null,\n" + 
				"  \"lastName\" : null\n" + 
				"}";
		Assert.assertNotEquals(actual, expect);
	}

}
