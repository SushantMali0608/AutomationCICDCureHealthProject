package PageObjects;

import org.openqa.selenium.WebDriver;


public class PageObjectManager {
	HealthCure healthcure;
	LoginPage loginpage;
	AddingInfo addinginfo;
	BookingConfirmation bookingconfirmation;
	WebDriver driver;
	
	public PageObjectManager(WebDriver driver){
		this.driver=driver;
	
	}
	
	public HealthCure HealtCure() {
	   healthcure = new HealthCure(driver);
	   return healthcure;
		
	}
	
	public LoginPage LoginPage() {
		loginpage=new LoginPage(driver);
		return loginpage;
	}
	
	public AddingInfo AddingInfo() {
		addinginfo = new AddingInfo(driver);
		
		return addinginfo;
	}
	
	public PageObjects.BookingConfirmation BookingConfirmation() {
		bookingconfirmation =new BookingConfirmation(driver);
		 return bookingconfirmation;
	}

}
