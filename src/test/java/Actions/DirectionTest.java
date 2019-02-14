package Actions;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.Direction;
@Listeners(CustomListener.class)
public class DirectionTest extends LiveTest {
  @Test(priority=4,description="Find direction")
  public void direction() throws InterruptedException 
  {
	  Direction d=new Direction(driver);
	  d.direction();
  }
}
