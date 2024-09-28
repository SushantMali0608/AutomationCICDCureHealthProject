package stepDefinations;

import org.openqa.selenium.By;
import org.testng.Assert;

import PageObjects.LoginPage;
import Utils.TextContextSetup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPagestepDefination {
	
	TextContextSetup textContextSetup;
	LoginPage loginpage;
	public LoginPagestepDefination(TextContextSetup textContextSetup ) {
		this.textContextSetup = textContextSetup;
		this.loginpage =textContextSetup.pageObjectManager.LoginPage();
		
	}

	
	@When("^Login with (.+) and (.+).$")
	public void login_with_username_and_password(String username ,String password) {
//		textContextSetup.driver.findElement(By.xpath("//input[@id=\"txt-username\"]")).sendKeys("John Doe");
//		textContextSetup.driver.findElement(By.xpath("//input[@id=\"txt-password\"]")).sendKeys("ThisIsNotAPassword");
//		textContextSetup.driver.findElement(By.id("btn-login")).click();
 //      LoginPage obj=new LoginPage(textContextSetup.driver);
       loginpage.Login(username,password);
}
	@Then("User will get Error message.")
	public void User_will_get_Error_message(){
		String Message =loginpage.Errormessage();
		System.out.println(Message);
		Assert.assertEquals(Message, "Login failed! Please ensure the username and password are valid.");
	}
}