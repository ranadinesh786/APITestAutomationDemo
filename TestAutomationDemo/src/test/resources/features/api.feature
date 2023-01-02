Feature: Backend Automation using Java and Serenity Rest Assured 
@ActiveTest 
Scenario: 1. register and validate a new user 
	Given Pass the payload to register the new user 
	When User POST the request 
	Then  user should get validated by response code 
	And user should be able to validate the response 
@ActiveTest 
Scenario: 2. get list of all users 
	Given get list of all users 
	And store information from response like email, first_name, last_name 
	And print all of them 
@ActiveTest 
Scenario: 
	3. get an error message if user is not passing the password in Payload request 
	Given User pass only the email in payload 
	When User POST the email request with email payload 
	Then User validate the error response 
@ActiveTest 
Scenario: 
	4.As a user, I should be able to login successfully and token should get generate. 
	Given user pass the payload to url 
	When post the username and password request 
	Then user should validate response code and token