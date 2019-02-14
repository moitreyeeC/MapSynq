package Actions;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.Search_Location;
@Listeners(CustomListener.class)
public class Search_LocationTest extends DirectionTest {
  @Test(priority=5,description="Search Location")
  public void searchLocation() throws InterruptedException 
  {
	  Search_Location sl=new Search_Location(driver);
	  sl.search();
  }
}
