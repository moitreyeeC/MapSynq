package Actions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.personal;
import junit.framework.Assert;
@Listeners(CustomListener.class)
public class PersonalTest extends setUp {
  @Test(priority=0,description="Register as a new user")
  public void register() throws InterruptedException 
  {
	  personal p=new personal(driver);
	  p.register();
	  String value="Create your mapSYNQ account";
	  String heading=driver.findElement(By.xpath("//h5[contains(text(),'Create your mapSYNQ account')]")).getText();
	  Assert.assertEquals(value, heading);
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("BACK")).click();
	  Thread.sleep(3000);
  }
}
