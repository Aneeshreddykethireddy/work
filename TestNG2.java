package sampleclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestNG2 {
	WebDriver driver;
	 @BeforeMethod
	  public void program1() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\anees\\Desktop\\selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://newtours.demoaut.com");
	  }

  @Test
  public void program2() {
	  driver.findElement(By.linkText("REGISTER")).click();
	  WebElement drop=driver.findElement(By.name("country"));
	  List<WebElement> dropdown=drop.findElements(By.tagName("option"));
	    for(int i=0;i<dropdown.size();i++);
	    int i = 0;
		dropdown.get(i).click();
		   if(dropdown.get(i).isSelected())
		   {
			   System.out.println(dropdown.get(i).getText()+" --> is Active");
		   }
		   else
		   {
			   System.out.println(dropdown.get(i).getText()+" --> is Inactive");
		   }
	    	 
	  
  }
 
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
