package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HealthCure {
	WebDriver driver;
	public  HealthCure(WebDriver driver) {
		
		this.driver=driver;
	}		
	
	//textContextSetup.driver.findElement(By.id("btn-make-appointment")).click();
	
	By Appointment = By.id("btn-make-appointment");
	
	public void MakeAppointment() {
		
		driver.findElement(Appointment).click();
	}

}
