package APITesting;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;

import io.restassured.response.Response;

public class GetRequest {
@Test
public void get() {
	
	Response response=RestAssured.when().get("https://jsonplaceholder.typicode.com");	
	response.prettyPrint();
	int code=response.getStatusCode();
	System.out.println(code);
	Assert.assertEquals(200, code);
}


}