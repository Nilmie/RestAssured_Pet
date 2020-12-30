package pet;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GetRequest {

    
	    @Test
	    public void GetAllPet() {
	         RestAssured.baseURI = "https://petstore.swagger.io/v2/pet";
	         
	         
	         RequestSpecification httpRequest = RestAssured.given();
	         RestAssured.given().contentType("application/json\r\n");
	        
	         Response response = httpRequest.get();
	         
	        
	       
	      // Assert.assertEquals(200, response.statusCode());
	     //  Assert.assertTrue(response.body().asString().contains("fish"));
	    }
	    
	    @Test
	    public void GetPet() {
	         RestAssured.baseURI = "https://petstore.swagger.io/v2/pet/9222968140491043255";
	         
	        
	         RequestSpecification httpRequest = RestAssured.given();
	         
	    
	         Response response = httpRequest.get();
	         
	         System.out.println(response.asString());
	         //ystem.out.println("Response Body is =>  " + response.asString());
	      	//Assert.assertEquals(200, response.statusCode());
	      	//Assert.assertTrue(response.body().asString().contains("doggie"));
	    }

	 

	}


