package Actions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.Live;
@Listeners(CustomListener.class)
public class LiveTest extends PersonalTest {
  @Test(priority=1,description="check live status")
  public void incident() throws InterruptedException 
  {
	  Live l=new Live(driver);
	  l.incident();
	String expectedvalue="No incident information available for current area.";
	String actualvalue=driver.findElement(By.xpath("//div[@id='divIncidentInfo']")).getText();
	if(!expectedvalue.equals(actualvalue))
	{
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='txtSearchIncidentsingapore']")).sendKeys("Changi Airport");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'14:07')]")).click();
	}
	else 

	{
		System.out.println(actualvalue);
	}
	
  }
  @Test(priority=2,description="check camera position")
  public void camera() throws InterruptedException
  {
	  Live c=new Live(driver);
	  c.camera(); 
 }
 
  @Test(priority=3,description="check toll list")
  public void toll() throws InterruptedException
  {
	  Live t=new Live(driver);
	  t.toll();
  }
}
