package com.data.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

// data tables with map : for parameterization of testcases

public class StepDefinitionWithMap {
WebDriver driver;
	
	@Given("^User is already on login page$")
	public void user_is_already_on_login_page()  {
		System.setProperty("webdriver.gecko.driver", "C://Selenium//geckodriver-v0.26.0-win32//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://classic.crmpro.com");
	    
	}

	@When("^Title of login page is from CRM$")
	public void Title_of_login_page_is_from_CRM()  {
		String pageTitle = driver.getTitle();
		System.out.println("Title of the page:  "+pageTitle);
		//Assert.assertEquals("CRMPRO  - CRM software for customer relationship management, sales, and support.", pageTitle);
	   
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) throws InterruptedException {
		for(Map<String,String> data : credentials.asMaps(String.class,String.class)){
		driver.findElement(By.name("username")).sendKeys(data.get("username"));
		driver.findElement(By.name("password")).sendKeys(data.get("password"));
		}
	   Thread.sleep(3000);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
	   // WebElement loginBtn = 
	    		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();;
	   // JavascriptExecutor jse = (JavascriptExecutor)driver;
	   // jse.executeScript("arguments[0].click();", loginBtn);
		
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page()  {
		String homePageTitle = driver.getTitle();
		System.out.println("Home Page Title is:  "+homePageTitle);
	   
	}

	@Then("^user moves to new deal page$")
	public void user_moves_to_new_deal_page() {
		//driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
			   
	}
	@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable dealData){
		for(Map<String, String> data : dealData.asMaps(String.class, String.class)){
		driver.findElement(By.id("title")).sendKeys(data.get("title"));
		driver.findElement(By.id("amount")).sendKeys(data.get("ammount"));
		driver.findElement(By.id("probability")).sendKeys(data.get("probability"));
		driver.findElement(By.id("commission")).sendKeys(data.get("commission"));
		
		//Save button(<input type="submit" value="save" c;ass="button">)
		driver.findElement(By.xpath("//[@value='save' and @type='submit']")).click();;
		/*
		 Actions action = new Actions(driver);
		
				action.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'Deal']"))).build().perform();
				driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
				 */
		
	}
	}
	

	@Then("^close the browser$")
	public void user_closes_the_browser() {
		driver.quit();
	    
	}
}


