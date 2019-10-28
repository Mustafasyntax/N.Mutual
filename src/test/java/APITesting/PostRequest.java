package APITesting;

import java.util.LinkedHashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequest {
	
	@Test
	public void post() {
	Map<String, Object> map=new LinkedHashMap<>();
	
	map.put("UserID","Mustafa Ozturk");
	map.put("title","automation engineer");
	map.put("body","N.Mutual");
	
	RestAssured.baseURI="https://jsonplaceholder.typicode.com/posts";
	
	Response rsp=
			given().
				accept(ContentType.JSON).
				header("Content-Type", "application/json").
				body(map).
			when().
				post("https://jsonplaceholder.typicode.com/posts");
			
			rsp.prettyPrint();
			int idnumber=rsp.jsonPath().get("id");
				System.out.println(idnumber); 
			

				
}
}