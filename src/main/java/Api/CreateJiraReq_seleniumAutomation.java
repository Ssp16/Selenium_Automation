package Api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.IOException;

public class CreateJiraReq_seleniumAutomation {
	RequestSpecification Req;
	ResponseSpecification Resp;
	String response;

	public String CreateJiraRequest() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		RestAssured.baseURI=utils.getGlobalValue("baseUrl");
		String response =given().header("Content-Type","application/json").auth().preemptive().
		basic("mailyosrini@gmail.com", "ATATT3xFfGF07ngQNIAVDPPQWP7eAbzFY8k_98k_HCd2hX3mdbUTxyRIgg24zTKjtdc5YM_grIwGT9y3mVj0LHSaE7bn0hfZzjjHHiNvzHHgIZVQIJeg6wpWIx01Od5SNIvFhjIuNVhKB3G13ZdSH8M_RFjnXLQjgrauLkZjvWqJAsMsYJeVY34=8622D3A4")
		.body("{\r\n"
				+ "  \"fields\": {\r\n"
				+ "    \"issuetype\": {\r\n"
				+ "      \"id\": \"10002\"\r\n"
				+ "    },\r\n"
				+ "    \"description\": \"Creating a new issue\",\r\n"
				+ "    \"summary\": \"New issue from rest api script\",\r\n"
				+ "    \"project\": {\r\n"
				+ "      \"key\": \"SSP\"\r\n"
				+ "    }\r\n"
				+ "  }\r\n"
				+ "}").log().all().when().post("/rest/api/2/issue").then().log().all().extract().asString();
		return response;
			
	}
	public void upload_attachment(String object) throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		given().header("X-Atlassian-Token","no-check").
		auth().preemptive().
		basic("mailyosrini@gmail.com", "ATATT3xFfGF07ngQNIAVDPPQWP7eAbzFY8k_98k_HCd2hX3mdbUTxyRIgg24zTKjtdc5YM_grIwGT9y3mVj0LHSaE7bn0hfZzjjHHiNvzHHgIZVQIJeg6wpWIx01Od5SNIvFhjIuNVhKB3G13ZdSH8M_RFjnXLQjgrauLkZjvWqJAsMsYJeVY34=8622D3A4").
		pathParam("issueId", object)

		.multiPart("file",new File("X:\\Selenium_Automation\\src\\main\\java\\Test1_Login.png")).header("Content-Type","multipart/form-data").when().

		post("/rest/api/2/issue/{issueId}/attachments").then().log().all().extract(); 
			
	}
	
}
