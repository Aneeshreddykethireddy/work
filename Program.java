package sampleclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Program {

public WebDriver driver;	
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anees\\Desktop\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://goair.in");
	}
	
	
	@Test (priority = 0 , enabled = false)
	public void twoDropdownSelection() throws InterruptedException
	{	
		
		WebElement fdrop=driver.findElement(By.id("departureCitysearchBoxUserControlCriteriaBox"));
		List<WebElement> list1=fdrop.findElements(By.tagName("option"));
		System.out.println(list1.size());
		
		for(int i=1;i<list1.size();i++){
			String fcity=list1.get(i).getText();
			list1.get(i).click();
			Thread.sleep(5000);
			
			
			WebElement sdrop=driver.findElement(By.id("toCitysearchBoxUserControlCriteriaBox"));
			List<WebElement> list2=sdrop.findElements(By.tagName("option"));
			System.out.println(list2.size());
			
			for(int j=0;j<list2.size();j++)
			{
				String scity=list2.get(j).getText();
				list2.get(j).click();
				
				if(scity.equals(fcity))
				{
					System.out.println(fcity+ "Is not functioning properly");
					break;
				}
				else
				{
					System.out.println(fcity+ " Is working Properly");
				}
			}
		}	
	}
	

	
	@Test (priority = 1)
	public void twoDropdownSelection1() throws InterruptedException 
	{

		WebElement fdrop1=driver.findElement(By.id("departureCitysearchBoxUserControlCriteriaBox"));
		
		Select list3=new Select(fdrop1);
		List<WebElement> items1=list3.getOptions();
		System.out.println("Total elements in First Dropdown is..: " + items1.size());
		
		for(int k=1;k<items1.size();k++){
			String fcity1=items1.get(k).getText();
			items1.get(k).click();
			Thread.sleep(5000);
			
			
			WebElement sdrop1=driver.findElement(By.id("toCitysearchBoxUserControlCriteriaBox"));
						
			Select list4=new Select(sdrop1);
			List<WebElement> items2=list4.getOptions();
			System.out.println("Total elements in second Dropdown is..: " + items2.size());
			
			for(int l=0;l<items2.size();l++)
			{
				String scity1=items2.get(l).getText();
				items2.get(l).click();
				
				if(scity1.equals(fcity1))
				{
					System.out.println("Selected cities :" + fcity1+ "--->" +  scity1 +   "Is not functioning properly");
					break;
				}
				else 
				{
					System.out.println("Selected cities :" + fcity1+ "--->" +  scity1 +   " Is working Properly");
				}
			}
		}	

		
	}
	
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	

}

