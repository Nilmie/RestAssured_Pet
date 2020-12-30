package pet;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

 

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostRequest {
	@Test
    public void PostPet() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2/pet/";
        RequestSpecification request = RestAssured.given().contentType("application/json");
    
        JSONObject requestParams = new JSONObject();
        requestParams.put("name", "Roarw"); 
        request.body(requestParams.toJSONString());
        Response response = request.post();
    
        Assert.assertEquals(200, response.statusCode());
        System.out.println(response.asString());
    }
}
