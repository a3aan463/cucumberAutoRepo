package com.basic.FirstFeatureFile;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyFirstStepDef {
	
	WebDriver driver;
	
	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page() {
		System.setProperty("webdriver.chrome.driver", "E:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("opening URL");
	}

	@When("^User enters user first name$")
	public void user_enters_user_first_name() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Alles accepteren']")).click();
		driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("David");
	}
	
	@Then("^User checks user first name is present$")
	public void user_checks_user_first_name_is_present() {
		String userNameActual = driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("value");
		Assert.assertEquals("David", userNameActual);
	}
}
