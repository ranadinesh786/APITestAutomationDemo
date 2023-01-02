package com.TestAutomationDemo.stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.hamcrest.Matchers;

import com.TestAutomation.resources.API1_Userdetails;
import com.TestAutomation.resources.API4PostRequestResponse;
import com.TestAutomationDemo.utils.library;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_Scenario4_generatetoken {
	private String loginapiurl = library.getProperty("loginapiurl");
	private RequestSpecification request;
	private Response tokenres;
	private String email = "eve.holt@reqres.in";
	private String password = "cityslicka";
	API1_Userdetails userDetails = new API1_Userdetails(email, password);

	@Given("user pass the payload to url")
	public void user_pass_the_payload_to_url() {
		try {
			request = RestAssured.given().baseUri(loginapiurl).contentType(ContentType.JSON).body(userDetails);
		} catch (Exception iOException) {
			
		}
	}

	@When("post the username and password request")
	public void post_username_password_Request() {
		tokenres = request.when().post();
		System.out.println(tokenres.asPrettyString());
	}

	@Then("user should validate response code and token")
	public void verifytokenResponsecode() {
		try {
			int tokenresponsecode = tokenres.getStatusCode();
			assertEquals(tokenresponsecode, 400, "Invalid response code " + tokenresponsecode);
		} catch (Exception e) {
			e.printStackTrace();
		}try {
			API4PostRequestResponse resBody = tokenres.body().as(API4PostRequestResponse.class);
			tokenres.then().assertThat().body("token", Matchers.equalTo(resBody.getToken()));
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
