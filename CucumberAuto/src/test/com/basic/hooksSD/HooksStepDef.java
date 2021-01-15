package com.basic.hooksSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class HooksStepDef {
	
	WebDriver driver;
	
	//Before volgorde gaat ascending op order, dus eerst order=1, dan order=2
	@Before(order=1)
	public void beforeSetup1() {
		System.out.println("in Before1");
		System.setProperty("webdriver.chrome.driver", "E:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
	}
	
	@Before(order=2)
	public void beforeSetup2() {
		System.out.println("in Before2");
	}
	
	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page() {
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
	}
	
	@And("^User enters user \"([^\"]*)\" surname$")
	public void user_enters_user_surname(String surName) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(surName);
		Thread.sleep(1000);
	}
	
	@Then("^User mobile field should be blank$")
	public void user_mobile_field_should_be_blank() throws InterruptedException {
		String mobileActual = driver.findElement(By.xpath("//input[@name='reg_email__']")).getAttribute("value");
		Assert.assertEquals("", mobileActual);
		Thread.sleep(1000);
	}
	
	/*
	 * @Then("^close browser$") public void close_browser() { driver.quit(); driver
	 * = null; }
	 */
	
	//After volgorde gaat descending op order, dus eerst order=2, dan order=1
	@After(order=2)
	public void tearDown1() {
		System.out.println("in After1");
		driver.quit();
		driver = null;
	}
	
	@After(order=1)
	public void tearDown2() {
		System.out.println("in After2");
	}
}
