package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserInitialization {
	/* Browsers constants */
	public static final String CHROME = "chrome";
	public static final String FIREFOX = "firefox";
	public static final String OPERA = "opera";
	public static final String INTERNET_EXPLORER = "ie";
    public static final String SAFARI = "safari";
	public static final String HTML_UNIT = "htmlunit";
	private final static String OS = System.getProperty("os.name").toLowerCase();
//public static WebDriver getDriver(){
//		
//		WebDriverManager.chromedriver().setup();
//		//WebDriver driver=new FirefoxDriver();
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		
//		return driver;
//		
//	}
	 public WebDriver getWebDriverInstance(String browserName) {
	    	
			WebDriver driver = null;
 		
			switch(browserName) {
 			case CHROME :
 				getChromeDriverLocation();
 				WebDriverManager.chromedriver().setup();
 				//WebDriver driver=new FirefoxDriver();
 				driver=new ChromeDriver();
 				driver.manage().window().maximize();	
 				break;
 			case FIREFOX :
    			
				break;
			
		}
			return driver;
}
	 private String getChromeDriverLocation() {

	        System.out.println("os: " + OS);

	        if (OS.indexOf("win") >= 0) {
	            return "src/main/resources/drivers/chrome/chromedriver.exe";
	        } else if (OS.indexOf("mac") >= 0) {
	            return "src/main/resources/drivers/chrome/chromedriver";
	        } else if (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0) {
	            return "src/main/resources/drivers/chrome/chromedriver";
	        }

	        return null;
	    }
}
