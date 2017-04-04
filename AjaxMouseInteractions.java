package sampleclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AjaxMouseInteractions {
 public WebDriver driver;
@Test
	public  void main() {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\anees\\Desktop\\selenium\\chromedriver.exe" );
	driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	Actions b=new Actions(driver);
	//b.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
	b.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();

	}

}
