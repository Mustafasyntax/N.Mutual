package APITesting;

import static io.restassured.RestAssured.given;

import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PutRequest {
	@Test
	public void put() {
	Map<String, Object> details=new LinkedHashMap<>();
	
	details.put("UserID","Tom Cruise");
	details.put("title","automation engineer");
	details.put("body","N.Mutual");
	
	RestAssured.baseURI="https://jsonplaceholder.typicode.com/posts";
	
	Response rsp=
			given().
				accept(ContentType.JSON).
				header("Content-Type", "application/json").
				body(details).
			    when().
				put("https://jsonplaceholder.typicode.com/posts/101");
	          rsp.prettyPrint();
}
}