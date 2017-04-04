package sampleclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Example {
	@Test
	
public void main() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anees\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goindigo.in/");
		driver.findElement(By.xpath(".//*[@id='roundWay']/form/div[1]/ul[1]/li[3]/input")).click();
		Select sel=new  Select(driver.findElement(By.xpath(".//*[@id='roundWay']/form/div[1]/ul[1]/li[3]/div/div[1]/label[2]")));
		
		sel.selectByValue("2");
		driver.findElement(By.xpath(".//*[@id='roundWay']/form/div[1]/ul[1]/li[1]/input[1]")).click();
		driver.findElement(By.xpath(".//*[@id='roundWay']/form/div[1]/ul[1]/li[1]/div/ul/li[28]")).click();
		driver.findElement(By.xpath(".//*[@id='roundWay']/form/div[1]/ul[1]/li[2]/input[1]")).click();
		
	
		
		
	}
}
