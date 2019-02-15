package Actions;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.Map;
@Listeners(CustomListener.class)
public class MapTest extends Search_LocationTest {
  @Test(priority=6,description="map")
  public void map() throws InterruptedException, IOException 
  {
	  Map m=new Map(driver);
	  m.map();
  }
}
