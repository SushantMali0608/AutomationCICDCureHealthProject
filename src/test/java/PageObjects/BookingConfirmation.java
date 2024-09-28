package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookingConfirmation {
	
	WebDriver driver;
	
	public BookingConfirmation(WebDriver driver) {
		this.driver=driver;
		
	}
	
	//String Confirmation_Message= textContextSetup.driver.findElement(By.tagName("h2")).getText();
	By text = By.tagName("h2");
	
	public String Confirmationmessage() {
		String Confirmation_Message= driver.findElement(text).getText();
		return Confirmation_Message;
	}

}
