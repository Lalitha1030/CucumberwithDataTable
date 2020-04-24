Feature: Free CRM Login Feature

Scenario: Free CRM login Test Scenario
	Given User is already on login page
	When Title of login page is from CRM
	Then user enters username and password 
	
	|naveenk | test@123|
	Then user clicks on login button
	Then user is on home page
	Then user moves to new deal page
	Then user enters deal details 
	
	|test data| 1000| 50| 10|
	Then  close the browser