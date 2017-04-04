package sampleclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Topdown {
@Test
	public void main() {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anees\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://book2.spicejet.com/");
		Select sel=new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")));
		sel.selectByValue("4");
		sel.selectByIndex(6);
		sel.selectByVisibleText("3");
		driver.findElement(By.xpath(".//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).click();
		driver.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[2]/li[2]/a")).click();
		driver.findElement(By.xpath("(.//*[@id='dropdownGroup1']/div/ul[3]/li[1]/a)[2]")).click();
        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_Defense")).click();
        System.out.println(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_Defense")).isSelected());
	}

}
