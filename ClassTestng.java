package sampleclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassTestng {
	public WebDriver driver;



	

	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anees\\Desktop\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://amazon.in");
	}


	@Test (priority = 0)
	public void Dropdown()
	{
		driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");


		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
		driver.findElement(By.className("nav-input")).click();


		String actual_title=driver.getTitle();
		String exp_title="Amazon.in: Harry Potter: Books";

		Assert.assertEquals(actual_title, exp_title);
	}


	@Test (priority = 1)
	public void Dropdown2()
	{
		Select sel=new Select(driver.findElement(By.id("searchDropdownBox")));
		sel.selectByVisibleText("Books");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry potter");
		driver.findElement(By.className("nav-input")).click();

		String actual_title=driver.getTitle();
		String exp_title="Amazon.in: Harry potter: Books";

		Assert.assertEquals(actual_title, exp_title);
	}




	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}


}
