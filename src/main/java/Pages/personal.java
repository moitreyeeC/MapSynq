package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utility.DriverBuilder;

public class personal extends DriverBuilder {
@FindBy(xpath="//a[@class='tab_button me_tab sprite']")WebElement personal_tab;
@FindBy(xpath="//input[@value='Register']")WebElement register_button;
@FindBy(xpath="//input[@value='Register']")WebElement register_button;
@FindBy(xpath="//input[@value='Register']")WebElement register_button;

	public personal(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
public void register()
{
	personal_tab.click();
	register_button.click();
}
	
}
