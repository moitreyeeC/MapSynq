package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DriverBuilder {
	public WebDriver driver;

	public DriverBuilder(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


}
