package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG1 {
	
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.gecko.driver", "C:/Users/geckodriver.exe");
		   driver=new FirefoxDriver();
		   driver.get("https://en.wikipedia.org/wiki/Rajinikanth");
	}
	
	@Test
	public void sampletestNG()
	
	{
		
		String str=driver.getPageSource();
		if(str.contains("Rajinikanth")){
			System.out.println("Element Exist");			
		}else
		{
			System.out.println("Element doesnot Exist");
		}
		
	}

	
	@AfterMethod
	public void classtestNG()
	
	{
		driver.quit();
	}
	
}
