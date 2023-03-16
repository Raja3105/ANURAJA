package org.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefenitionClass {
	WebDriver driver;
	@Given("User launches the facebook URL")
	public void user_launches_the_facebook_URL() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	   
	}

	@When("User enters the {string} and {string}")
	public void user_enters_the_and(String string,String string2) {
		driver.findElement(By.id("email")).sendKeys(string);
		driver.findElement(By.id("pass")).sendKeys(string2);
	     
	}

	@When("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
		driver.findElement(By.name("login")).click();
	    
	}

	@Then("User validates the title of the webpage")
	public void user_validates_the_title_of_the_webpage() throws InterruptedException {
			boolean contains = driver.getTitle().contains("Facebook");
			Assert.assertTrue(contains);
			Thread.sleep(2000);
			driver.quit();
	    
	}


}
