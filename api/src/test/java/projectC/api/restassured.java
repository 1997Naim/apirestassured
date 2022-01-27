package projectC.api;
import java.io.File;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import junit.framework.Assert;


public class restassured {

	public static void main(String[] args) {
		Response responsive = get("https://reqres.in/api/users?page=2");
		responsive.prettyPrint();
		 int statusc=responsive.statusCode();
		 System.out.println(statusc);
		 Assert.assertEquals(statusc, 200);
		 
		 ResponseBody verifying=responsive.getBody();
		String converts= verifying.asString();
		Assert.assertEquals(converts.contains("Funke"), true);
		File it=new File("C:\\Users\\naimu\\eclipse-workspace\\bootcamp\\api\\post.Jason");
		Response gt=given().contentType(ContentType.JSON).body(it).post("https://reqres.in/api/users?page=2");
		gt.prettyPrint();
			}

}


