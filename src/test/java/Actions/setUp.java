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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.BrowserInitialization;
import Utility.Constant;


public class setUp {
    protected static  WebDriver driver;
	static int i=0;
	@BeforeTest
	public void OpenURL() {
		driver = BrowserInitialization.getDriver();
		driver.get(Constant.URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	 public static void takenscreenshot()
	  {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss"). format(Calendar. getInstance(). getTime());
		try {
			FileUtils.copyFile(source, new File("./Screenshots/"+timeStamp+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("screenshot is captured");
		i++;
		
	  }

//  @AfterTest
//	public void CloseDriver() {
//		driver.quit();
//	}
}
