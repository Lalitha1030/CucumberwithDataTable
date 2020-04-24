Feature: Free CRM Login Feature

Scenario: Free CRM login Test Scenario
	Given User is already on login page
	When Title of login page is from CRM
	Then user enters username and password
	|username		 | password|
	|batchautomation | Test@12345l|
	Then user clicks on login button
	Then user is on home page
	Then user moves to new deal page
	Then user enters deal details 
	|title| ammount|probability|commission|
	|test data1| 1000| 50| 10|
	|test data2| 2000| 60| 20|
	|test data3| 3000| 70| 30|
	Then  close the browser