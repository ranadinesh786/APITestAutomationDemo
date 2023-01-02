package com.TestAutomationDemo.stepdefinitions;

import static org.testng.Assert.assertEquals;
import org.hamcrest.Matchers;
import com.TestAutomation.resources.API1_Userdetails;
import com.TestAutomation.resources.API1_postRequestResponse;
import com.TestAutomationDemo.utils.library;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_Scenario1_createuser {
	private String createuserURI = library.getProperty("API_userURI");
	private RequestSpecification request;
	private Response res;
	private String name = "Robert Peterson";
	private String job = "QA";
	API1_Userdetails userDetails = new API1_Userdetails(name, job);

	@Given("Pass the payload to register the new user")
	public void pass_the_payload_to_register_the_newuser() {
		try {
			request = RestAssured.given().baseUri(createuserURI).contentType(ContentType.JSON).body(userDetails);
		} catch (Exception iOException) {
			
		}
	}

	@When("User POST the request")
	public void postRequest() {
		res = request.when().post();
		System.out.println(res.asPrettyString());
	}

	@Then("user should get validated by response code")
	public void verifyResponsecode() {
		try {
			int responsecode = res.getStatusCode();
			assertEquals(responsecode, 201, "Invalid response code " + responsecode);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("user should be able to validate the response")
	public void verifyResponse() {
		try {
			API1_postRequestResponse resBody = res.body().as(API1_postRequestResponse.class);
			res.then().assertThat().body("name", Matchers.equalTo(resBody.getName())).body("job",
					Matchers.equalTo(resBody.getJob()));
		} catch (Exception e) {
		}
	}
}
