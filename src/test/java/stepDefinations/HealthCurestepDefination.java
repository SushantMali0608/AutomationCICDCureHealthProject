package stepDefinations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import PageObjects.HealthCure;
import Utils.TextContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HealthCurestepDefination {
	
	
	TextContextSetup textContextSetup;
	HealthCure healthcure;
	public HealthCurestepDefination(TextContextSetup textContextSetup ) {
		this.textContextSetup = textContextSetup;
		this.healthcure =textContextSetup.pageObjectManager.HealtCure();
		
	}
	@Given("User is on homepage.")
	public void user_is_on_homepage() {
//	System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
//	textContextSetup.driver = new ChromeDriver();
//	textContextSetup.driver.manage().window().maximize();
//	textContextSetup.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	textContextSetup.driver.get("https://katalon-demo-cura.herokuapp.com/");
	   
	}
	@When("User click on make appointment.")
	public void user_click_on_make_appointment() {
		//textContextSetup.driver.findElement(By.id("btn-make-appointment")).click();
		healthcure.MakeAppointment();
	    
	}
//	@When("Login with valid username and password.")
//	public void login_with_valid_username_and_password() {
//		textContextSetup.driver.findElement(By.xpath("//input[@id=\"txt-username\"]")).sendKeys("John Doe");
//		textContextSetup.driver.findElement(By.xpath("//input[@id=\"txt-password\"]")).sendKeys("ThisIsNotAPassword");
//		textContextSetup.driver.findElement(By.id("btn-login")).click();
//	    
//	}
//	@Then("User Filled information.")
//	public void user_filled_information() {
//		WebElement dropdownvalue =textContextSetup.driver.findElement(By.cssSelector("Select[name=\"facility\"]"));
//	    dropdownvalue.click();
//	     Select dropdown = new Select(dropdownvalue);
//	     dropdown.selectByValue("Hongkong CURA Healthcare Center");
//	     
//	     textContextSetup.driver.findElement(By.cssSelector("input[type='checkbox']")).click();
//	 List <WebElement> list =textContextSetup.driver.findElements(By.xpath("//label[@class='radio-inline']"));
//	 
//	 System.out.println(list.size());
//	 for(int i=0;i<list.size();i++) {
//		 
//		String Healthcare_Program = list.get(i).getText();
//		System.out.println(Healthcare_Program);
//		
//		if(Healthcare_Program.equalsIgnoreCase("Medicaid")) {
//						list.get(i).click();
//			break;
//	}
// }
//	 
//	 textContextSetup.driver.findElement(By.cssSelector("div.input-group.date")).click();
//	 List<WebElement> Days =textContextSetup.driver.findElements(By.xpath("//table/tbody/tr/td[@class=\"day\"]"));
//	 System.out.println(Days.size());
//	 
//	 for(int i = 1;i<=Days.size();i++) {
//		 
//		 String Day = Days.get(i).getText();
//		 
//		 if(Day.equalsIgnoreCase("9")) {
//			 Days.get(i).click();
//			 break;
//		 }
//	 }
//	 
//	 textContextSetup.driver.findElement(By.id("txt_comment")).sendKeys("Need Apppointment");
//	 textContextSetup.driver.findElement(By.className("btn-default")).click();
//	   
//	}
//	@Then("got Booking confiramation message.")
//	public void got_booking_confiramation_message() {
//		String Confirmation_Message= textContextSetup.driver.findElement(By.tagName("h2")).getText();
//		 
//		 Assert.assertEquals(Confirmation_Message,"Appointment Confirmation", "Appointment Booked");
//	    
//	}

}
