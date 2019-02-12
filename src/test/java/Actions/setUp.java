package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.BrowserInitialization;
import Utility.Constant;


public class setUp {
    protected  WebDriver driver;
	
	@BeforeTest
	public void OpenURL() {
		driver = BrowserInitialization.getDriver();
		driver.get(Constant.URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

//  @AfterTest
//	public void CloseDriver() {
//		driver.quit();
//	}
}
