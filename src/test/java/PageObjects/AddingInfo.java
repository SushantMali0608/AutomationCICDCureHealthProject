package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddingInfo {
	WebDriver driver;
	public AddingInfo(WebDriver driver) {
		
		this.driver=driver;
		
	}
	//textContextSetup.driver.findElement(By.cssSelector("Select[name=\"facility\"]"));
	
	By facility = By.cssSelector("Select[name=\"facility\"]");
	
	// textContextSetup.driver.findElement(By.cssSelector("input[type='checkbox']")).click();
	 By checkbox =By.cssSelector("input[type='checkbox']");
	 
	 //textContextSetup.driver.findElements(By.xpath("//label[@class='radio-inline']"));
	 By Radiobutton = By.xpath("//label[@class='radio-inline']");
	 
	 //textContextSetup.driver.findElement(By.cssSelector("div.input-group.date")).click();
	 By CalenderClick =By.cssSelector("div.input-group.date");
	 
	 By YearSwitch = By.cssSelector("div[class='datepicker-days'] th[class='datepicker-switch']");
	 // driver.findElement(By.xpath("//th[normalize-space()='2024']")).click();
	 By MonthSwitch =By.xpath("//th[normalize-space()='2024']");
	 By Year = By.className("year");
	 //driver.findElements(By.className("month"));
	 By Month = By.className("month");
	 //By.xpath("//table/tbody/tr/td[@class=\"day\"]"))
	 By date = By.xpath("//table/tbody/tr/td[@class=\"day\"]");
	 //textContextSetup.driver.findElement(By.id("txt_comment")).sendKeys("Need Apppointment");
	 By Comment= By.id("txt_comment");
	 //textContextSetup.driver.findElement(By.className("btn-default")).click();
	 
	 By submit =By.className("btn-default");
	 
	 public void Selectingfacility(String facilty2) {
		 WebElement dropdownvalue =driver.findElement(facility);
		    dropdownvalue.click();
		     Select dropdown = new Select(dropdownvalue);
		     dropdown.selectByValue(facilty2);
	 }
	 
	 public void SelectingCheckbox() {
		 
		 driver.findElement(checkbox).click();
		 
	 }
		 
	public void SelectingRadioButton(String healthProgram) {
		 List <WebElement> list =driver.findElements(Radiobutton);
		 
		 System.out.println(list.size());
		 for(int i=0;i<list.size();i++) {
			 
			String Healthcare_Program = list.get(i).getText();
			System.out.println(Healthcare_Program);
			
			if(Healthcare_Program.equalsIgnoreCase(healthProgram)) {
							list.get(i).click();
				break;
		}
	 }
	 }
	
	public void DateSelection(String date2) {
		
		 driver.findElement(CalenderClick).click();
		 driver.findElement(YearSwitch).click();
		 driver.findElement(MonthSwitch).click();
		 List <WebElement> years =driver.findElements(Year);
		for(WebElement i:years) {
			String year= i.getText();
			if(year.contains("2028")){
				i.click();
				break;
			}
		}
		 
		 
//		 for (int i=1;i<=years.size();i++) {
//			 String year =years.get(i).getText();
//			 if (year.equalsIgnoreCase("2027")) {
//				 years.get(i).click();
//				 break;
//			 }
//		 }
		 
		 List <WebElement> months = driver.findElements(Month);
				 for (int i=1;i<=months.size();i++) {
					 String mon =months.get(i).getText();
					 if (mon.equalsIgnoreCase("Dec")) {
						 months.get(i).click();
						 break;
					 }
				 }
				 
		 List<WebElement> Days =driver.findElements(date);
		 System.out.println(Days.size());
		 
		 for(int i = 1;i<=Days.size();i++) {
			 
			 String Day = Days.get(i).getText();
			 
			 if(Day.equalsIgnoreCase(date2)) {
				 Days.get(i).click();
				 break;
			 }
		 }
	}
	
	public void AddingCommment() {
		driver.findElement(Comment).sendKeys("Need Apppointment");
	}
	
	public void SubmitInfo() {
		
		driver.findElement(submit).click();
		
		
	}
	 
	 

}
