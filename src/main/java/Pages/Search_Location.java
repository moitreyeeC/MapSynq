package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.DriverBuilder;

public class Search_Location extends DriverBuilder {

	public Search_Location(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
@FindBy(xpath="//input[@id='txtGlobalSearch']")WebElement search;
@FindBy(xpath="//ul[@class='ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all']//li[4]//a[1]")WebElement valueFromList;
WebDriverWait wait = new WebDriverWait(driver, 30);

public void search() throws InterruptedException
{
	Thread.sleep(3000);
	search.sendKeys("changi");
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all']//li[3]")));
	valueFromList.click();
	driver.findElement(By.xpath("//div[@class='placeResult']//div[2]//table[1]")).click();
	Thread.sleep(3000);
	if(driver.findElements(By.xpath("//div[@id='popup_windows_439845']")).size() != 0)
	{
	System.out.println("popup is Present");
	}
else
	{
	System.out.println("popup is Absent");
	}
	
	
}
}

