package com.basic.sharedataSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.FacebookHomePage;


public class ShareDataStepDef {
	
	WebDriver driver;
	
	public ShareDataStepDef(SharedClass share) {
		driver = share.setup();
	}
		
	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page() {
		System.setProperty("webdriver.chrome.driver", "E:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@When("^User enters user \"([^\"]*)\" first name$")
	public void user_enters_user_first_name(String userName) throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Alles accepteren']")).click();
		driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(userName);
	}
	
	@Then("^User checks user \"([^\"]*)\" first name is present$")
	public void user_checks_user_first_name_is_present(String userName) throws InterruptedException {
		String userNameActual = driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("value");
		Assert.assertEquals(userName, userNameActual);
		Thread.sleep(1000);
		//WebElement webElement = driver.findElement(By.xpath("//input[@name='firstname']"));//You can use xpath, ID or name whatever you like
		//webElement.sendKeys(Keys.TAB);
	}
	
	
	
}
