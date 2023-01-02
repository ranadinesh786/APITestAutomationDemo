package com.TestAutomationDemo.stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.util.List;

import com.TestAutomation.resources.API2Userdetails;
import com.TestAutomation.resources.Datum;
import com.TestAutomation.resources.Support;
import com.TestAutomationDemo.utils.library;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_Scenario2_createuser2 {
	private String API_userURI = library.getProperty("API_userURI");
	private RequestSpecification request;
	private Response res;
	private int id;
	private String email;
	private String first_name;
	private String last_name;
	private String avatar;
	private Integer page;
	private Integer perPage;
	private Integer total;
	private Integer totalPages;
	private List<Datum> data;
	private Support support;
	
	API2Userdetails userDetails = new API2Userdetails(page, perPage, total, totalPages, data, support);
	API2Userdetails resBody;
	API2Userdetails API2Userdetail;

	@Given("get list of all users")
	public void get_list_of_all_users() {
		res = RestAssured.given().baseUri(API_userURI).get();
		int responsecode = res.getStatusCode();
		assertEquals(responsecode, 200, "Invalid response code " + responsecode);
	}

	@And("store information from response like email, first_name, last_name")
	public void stroreUserInfo() {
		API2Userdetail = res.body().as(API2Userdetails.class);
	}

	@And("print all of them")
	public void printApiResponse() {
		System.out.println(API2Userdetail.toString().trim());
	}

}
