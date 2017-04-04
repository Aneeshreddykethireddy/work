package sampleclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium {
	@Test
	public void main(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anees\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");	


		String expval=driver.findElement(By.linkText("Images")).getAttribute("href");
		driver.findElement(By.linkText("Images")).click();
		String actval=driver.getCurrentUrl();
		if(actval.contains(expval)){
			System.out.println("Images links are same \n" +  actval  +  "\n"  + expval);
		}
		else
		{
			System.out.println("Images links are different \n"+actval+"\n"+ expval);
		}
		driver.quit();
	}
}

