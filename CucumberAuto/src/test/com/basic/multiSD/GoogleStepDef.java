package com.basic.multiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class GoogleStepDef {

WebDriver driver;
	
	@Given("^User need to be on google page$")
	public void user_need_to_be_on_google_page() {
		System.setProperty("webdriver.chrome.driver", "E:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@When("^User enters search string$")
	public void user_enters_search_string() throws InterruptedException {
		Thread.sleep(1000);

		driver.switchTo().frame(0);
		Thread.sleep(1000);
		String handle = driver.getWindowHandle();
		System.out.println(handle);

		driver.findElement(By.xpath("//div[@id='introAgreeButton']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@title='Zoeken']")).sendKeys("selenium");
		Thread.sleep(1000);
	}
}
