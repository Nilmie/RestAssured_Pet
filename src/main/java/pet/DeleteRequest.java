package pet;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteRequest {

	 @Test
	    public void DeletePet() {
	        RestAssured.baseURI = "https://petstore.swagger.io/v2/pet/";
	        RequestSpecification request = RestAssured.given().contentType("application/json");
	    

	        Response response = request.delete("9222968140491043255");
	        
	        
	 }
}
