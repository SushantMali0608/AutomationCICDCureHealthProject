package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
public  LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
//	textContextSetup.driver.findElement(By.xpath("//input[@id=\"txt-username\"]")).sendKeys("John Doe");
//	textContextSetup.driver.findElement(By.xpath("//input[@id=\"txt-password\"]")).sendKeys("ThisIsNotAPassword");
//	textContextSetup.driver.findElement(By.id("btn-login")).click();
//    driver.findElement(By.cssSelector(".text-danger")).getText();

	By username = By.xpath("//input[@id=\"txt-username\"]");
	By password =  By.xpath("//input[@id=\"txt-password\"]");
	By Login =    By.id("btn-login");
	By error =  By.cssSelector(".text-danger");


public void Login(String username2, String password2) {
	
	driver.findElement(username).sendKeys(username2);
	driver.findElement(password).sendKeys(password2);
	driver.findElement(Login).click();
}

public String Errormessage() {
	
	
	String Message =driver.findElement(error).getText();
	return Message;
}

}
