package stepDefinations;

import org.openqa.selenium.By;
import org.testng.Assert;

import PageObjects.BookingConfirmation;
import Utils.TextContextSetup;
import io.cucumber.java.en.Then;

public class BookingConfirmationstepDefination {
	
	TextContextSetup textContextSetup;
	BookingConfirmation bookingconfirmation;
	public BookingConfirmationstepDefination (TextContextSetup textContextSetup ) {
		this.textContextSetup = textContextSetup;
		this.bookingconfirmation=textContextSetup.pageObjectManager.BookingConfirmation();

}
	@Then("got Booking confiramation message.")
	public void got_booking_confiramation_message() {
		
		//BookingConfirmation obj = new BookingConfirmation(textContextSetup.driver);
		//String Confirmation_Message= textContextSetup.driver.findElement(By.tagName("h2")).getText();
		 String Confirmation_Message = bookingconfirmation.Confirmationmessage();
		 Assert.assertEquals(Confirmation_Message,"Appointment Confirmation", "Appointment Booked");
	    
	}
	
}