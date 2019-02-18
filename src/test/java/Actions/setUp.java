package Actions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;


import Utility.BrowserInitialization;
import Utility.Constant;
import Utility.ManageProperty;


public class setUp {
    protected static   WebDriver driver;
	static int i=0;
	
	@BeforeSuite
	public void init() {
		
		driver = new BrowserInitialization().getWebDriverInstance(ManageProperty.getValue("browser.name"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@BeforeClass
	public void OpenURL() {
		//driver = BrowserInitialization.getDriver();
		driver.get(Constant.URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	 public static  void takenscreenshot()
	  {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss"). format(Calendar. getInstance(). getTime());
		try {
			FileUtils.copyFile(source, new File("./Screenshots/"+driver.getTitle()+timeStamp+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("screenshot is captured");
		i++;
		
	  }
	 @AfterClass
	  public void genrateReport(){
		  
		  System.out.println("Report");
	  }


	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		System.out.println("setUp.tearDown()");
		if (driver != null) {
			driver.quit();
		}
	}

//  @AfterTest
//	public void CloseDriver() {
//		driver.quit();
//	}
}
