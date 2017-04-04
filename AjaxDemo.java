package sampleclass;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AjaxDemo {
	public WebDriver driver;

	@Before

	public void main() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anees\\Desktop\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://www.veethi.com/places/india_banks-ifsc-micr-codes.html");
	}

	@Test
	public void test() {
		Select bank = new Select(driver.findElement(By.id("selBank")));
		bank.selectByValue("15");
		Select state = new Select(driver.findElement(By.id("selState")));
		state.selectByValue("1");
		Select city = new Select(driver.findElement(By.id("selCity")));
		city.selectByValue("59");
		Select branchname = new Select(driver.findElement(By.id("selBranch")));
		branchname.selectByValue("19109");
	
		
	}


}
