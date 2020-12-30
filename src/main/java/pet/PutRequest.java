package pet;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

 

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutRequest {

	 @Test
	    public void PostPet() {
	        RestAssured.baseURI = "https://petstore.swagger.io/v2/pet/";
	        RequestSpecification request = RestAssured.given().contentType("application/json");
	    
	        JSONObject requestParams = new JSONObject();
	        requestParams.put("name", "updateRoarwai"); 
	        request.body(requestParams.toJSONString());
	        Response response = request.put("9222968140491043255");
	    
	      //  Assert.assertEquals(200, response.statusCode());
	        System.out.println(response.asString());
	    }
}
