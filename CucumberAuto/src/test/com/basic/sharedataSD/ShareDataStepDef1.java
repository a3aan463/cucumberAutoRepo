package com.basic.sharedataSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ShareDataStepDef1 {
	
	WebDriver driver;
	
	public ShareDataStepDef1(SharedClass share) {
		driver = share.setup();
	}
	
		
	@When("^User enters user \"([^\"]*)\" surname$")
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

}
