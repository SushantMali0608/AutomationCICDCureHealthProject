package stepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import PageObjects.AddingInfo;
import Utils.TextContextSetup;
import io.cucumber.java.en.Then;

public class AddingInfostepDefination {

	TextContextSetup textContextSetup;
	AddingInfo addinginfo;
	public AddingInfostepDefination(TextContextSetup textContextSetup ) {
		this.textContextSetup = textContextSetup;
		this.addinginfo=textContextSetup.pageObjectManager.AddingInfo();
}
	
	
	@Then("^User Filled information(.+)and(.+)and(.+).$")
	public void user_filled_information(String facilty,String HealthProgram, String Date) {
		
//		AddingInfo obj = new AddingInfo(textContextSetup.driver);
//		WebElement dropdownvalue =textContextSetup.driver.findElement(By.cssSelector("Select[name=\"facility\"]"));
//	    dropdownvalue.click();
//	     Select dropdown = new Select(dropdownvalue);
//	     dropdown.selectByValue("Hongkong CURA Healthcare Center");
        addinginfo.Selectingfacility(facilty);
	     
//	     textContextSetup.driver.findElement(By.cssSelector("input[type='checkbox']")).click();
//	 List <WebElement> list =textContextSetup.driver.findElements(By.xpath("//label[@class='radio-inline']"));
        addinginfo.SelectingCheckbox();
	 
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
        addinginfo.SelectingRadioButton(HealthProgram);
	 
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
	 
        addinginfo.DateSelection(Date);
	 
        addinginfo.AddingCommment();
        addinginfo.SubmitInfo();
	 
//	 textContextSetup.driver.findElement(By.id("txt_comment")).sendKeys("Need Apppointment");
//	 textContextSetup.driver.findElement(By.className("btn-default")).click();
	   
	}
}