package com.TestAutomationDemo.stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.hamcrest.Matchers;

import com.TestAutomation.resources.API3Emaildetail;
import com.TestAutomation.resources.API3_postRequestResponse;
import com.TestAutomationDemo.utils.library;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_Scenario3_verifyerror {
	private String loginapiurl = library.getProperty("loginapiurl");
	private RequestSpecification emailrequest;
	private Response emailres;
	private String email = "Robert Peterson";
	API3Emaildetail useremailDetails = new API3Emaildetail(email);

	@Given("User pass only the email in payload")
	public void pass_the_payload_to_register_the_newuser() {
		try {
			emailrequest = RestAssured.given().baseUri(loginapiurl).contentType(ContentType.JSON)
					.body(useremailDetails);
		} catch (Exception iOException) {

		}
	}

	@When("User POST the email request with email payload")
	public void postemailRequest() {
		emailres = emailrequest.when().post();
		System.out.println(emailres.asPrettyString());
	}

	@Then("User validate the error response")
	public void verifyemailResponsecode() {
		try {
			try {
				int responsecode = emailres.getStatusCode();
				assertEquals(responsecode, 400, "Invalid response code " + responsecode);
			} catch (Exception e) {
			}
			try {
				API3_postRequestResponse resBody = emailres.body().as(API3_postRequestResponse.class);
				emailres.then().assertThat().body("error", Matchers.equalTo(resBody.getError()));
			} catch (Exception e) {
				// TODO: handle exception
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
