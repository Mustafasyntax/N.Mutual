package APITesting;

import org.junit.Test;
import io.restassured.RestAssured;

public class DeleteRequest {

	@Test
	
	public void delete() {
	
		RestAssured.when().delete("https://jsonplaceholder.typicode.com/posts/1");
}
}