//package com.data.stepdefinition;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class DataStepDefinition {
//	
//	WebDriver driver;
//	
//	@Given("^User is already on login page$")
//	public void user_is_already_on_login_page()  {
//		System.setProperty("Webdriver.gecko.driver", "C://Selenium//geckodriver-v0.26.0-win32//geckodriver.exe");
//		driver = new FirefoxDriver();
//		driver.get("https://classic.crmpro.com/index.html?e=1");
//	    
//	}
//
//	@When("^Title of login page is from CRM$")
//	public void Title_of_login_page_is_from_CRM()  {
//		String pageTitle = driver.getTitle();
//		System.out.println("Title of the page:  "+pageTitle);
//		Assert.assertEquals("CRMPRO  - CRM software for customer relationship management, sales, and support.", pageTitle);
//	   
//	}
//
//	@Then("^user enters  username and password$")
//	public void user_enters_username_and_password(DataTable credentials)  {
//		List<List<String>> data = credentials.raw();
//		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
//		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//		
//	   
//	}
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() {
//	    WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
//	    JavascriptExecutor jse = (JavascriptExecutor)driver;
//	    jse.executeScript("zrguments[0].click", loginBtn);
//		
//	}
//
//	@Then("^user is on home page$")
//	public void user_is_on_home_page()  {
//		String homePageTitle = driver.getTitle();
//		System.out.println("Home Page Title is:  "+homePageTitle);
//	   
//	}
//
//	@Then("^user moves to new deal page$")
//	public void user_moves_to_new_deal_page() {
//		driver.switchTo().frame("mainpanel");
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'Deal')]"))).build().perform();
//		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
//			   
//	}
//	@Then("^user enters deal details$")
//	public void user_enters_deal_details(DataTable dealData){
//		List<List<String>> data = dealData.raw();
//		driver.findElement(By.id("title")).sendKeys(data.get(0).get(0));
//		driver.findElement(By.id("amount")).sendKeys(data.get(0).get(1));
//		driver.findElement(By.id("probability")).sendKeys(data.get(0).get(2));
//		driver.findElement(By.id("commission")).sendKeys(data.get(0).get(3));
//		
//		
//	}
//	
//
//	@Then("^user closes the browser$")
//	public void user_closes_the_browser() {
//		driver.quit();
//	    
//	}
//}
