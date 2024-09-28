package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\Resurces\\global.properties"); 
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("QAUrl"); 
		
		if (driver == null) {
			if(prop.getProperty("Browser").equalsIgnoreCase("chrome")) {
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver-win64\\\\chromedriver-win64");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(url);
		}
		
		return driver;
	}

}
