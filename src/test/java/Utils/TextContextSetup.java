package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

public class TextContextSetup {
	
	public WebDriver driver;
	public PageObjectManager pageObjectManager;
	public TestBase testbase;
	
	public TextContextSetup() throws IOException {
		
		testbase = new TestBase();
		pageObjectManager =new PageObjectManager(testbase.WebDriverManager());
	}
	
	

}
