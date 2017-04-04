package sampleclass;

import org.testng.annotations.Test;

import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.treetable.TreeTableModelAdapter;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class Mouseoperatiions {
	WebDriver driver;
	
	 @BeforeMethod
	  public void beforeMethod() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\anees\\Desktop\\selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
	  }
  @Test (priority =1)
 	  public void movetoelements() throws InterruptedException{
	  driver.get("https://aptransport.in/tgcfstonline");
	 
	  Actions a=new Actions(driver);
	  a.moveToElement(driver.findElement(By.linkText("EDUCATIONAL INSTITUTION"))).build().perform();
	  Thread.sleep(6000);
	  driver.findElement(By.xpath("//*[@id='ctl00_lbtnlogin']")).click();
	  Thread.sleep(6000);
	  
	  
  }
  
 @Test (priority =2)
 public void DragAndDDrop() throws InterruptedException{
	 driver.get("http://jqueryui.com/droppable/");
	 driver.switchTo().frame(0);
	 Actions b=new Actions(driver);
	 WebElement drag=driver.findElement(By.xpath("//*[@id='droppable']"));
	 b.dragAndDrop(driver.findElement(By.xpath("//*[@id='draggable']/p")), drag).build().perform();
	 Thread.sleep(6000);
 }
 
@Test (priority =3)
public void Draganddropby(){
driver.get("http://jqueryui.com/slider/");
driver.switchTo().frame(0);
Actions b=new Actions(driver);
b.dragAndDropBy(driver.findElement(By.xpath("//*[@id='slider']/span")), 200, 0).build().perform();
}


  @AfterMethod
  public void afterMethod() {
  }

}
