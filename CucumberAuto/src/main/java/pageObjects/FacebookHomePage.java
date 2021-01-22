package pageObjects;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

 
public class FacebookHomePage {
 WebDriver driver;
 
 public FacebookHomePage(WebDriver driver) {
 this.driver = driver;
 PageFactory.initElements(driver, this);
 }
 
 public void navigateTo_HomePage() {
	 
 driver.get("https://www.facebook.com/");
	
 }
 
 @FindBy(how = How.XPATH, using = "//button[text()='Alles accepteren']") 
 private WebElement btn_Alles_Accepteren;
 
 @FindBy(how = How.XPATH, using = "//a[@id='u_0_2']") 
 private WebElement btn_Register_New_Account;
 
 public void clickOn_Alles_Accepteren(){
	 btn_Alles_Accepteren.click();
	 }
 
 public void clickOn_Register_New_Account(){
	 btn_Register_New_Account.click();
	 }
}