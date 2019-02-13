package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.DriverBuilder;

public class Direction extends DriverBuilder {

	public Direction(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
@FindBy(xpath="//a[@class='tab_button directions_tab sprite tab_active']")WebElement direction_tab;
@FindBy(xpath="//a[@class='button']")WebElement clear;
@FindBy(xpath="//input[@id='poi_from']")WebElement current;
@FindBy(xpath="//input[@id='poi_to']")WebElement destination;
@FindBy(xpath="//input[@id='also_fastest']")WebElement fastest;
@FindBy(xpath="//input[@id='also_shortest']")WebElement shortest;
@FindBy(xpath="//input[@title='Swap origin/destination']")WebElement swap;
@FindBy(xpath="//input[@value='Get Directions']")WebElement get_Direction;
WebDriverWait wait = new WebDriverWait(driver, 30);

public void direction() throws InterruptedException
{
	
	driver.findElement(By.xpath("//div[@id='ad_toggle']")).click();
	Thread.sleep(3000);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='tab_button directions_tab sprite tab_active']")));
	direction_tab.click();
	Thread.sleep(3000);
	clear.click();
	current.sendKeys("changi");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@title='Changi Rd']")).click();
	destination.sendKeys("clementi");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@title='CLEMENTI STADIUM']")).click();
	Thread.sleep(2000);
	swap.click();
	Thread.sleep(2000);
	get_Direction.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='slJourneyTimeTraffic']")));
	WebElement value=driver.findElement(By.xpath("//select[@id='slJourneyTimeTraffic']"));
	if(value.isDisplayed())
	{
		Select time=new Select(driver.findElement(By.xpath("//select[@id='slJourneyTimeTraffic']")));
		Thread.sleep(3000);
		time.selectByIndex(1);
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//span[@id='spanDirTimeStamp']")).getText());
	}
	driver.findElement(By.xpath("//span[@id='fastest_route_ribbon']")).click();
	Thread.sleep(2000);
	WebElement value1=driver.findElement(By.xpath("//[contains(text(),'UTurn along Jln Mas Puteh')]"));
	if(value1.isDisplayed())
	{
		value1.click();
		if(driver.findElements(By.xpath("//div[@id='popup_contentDiv']")).size() != 0)
			{
			System.out.println("Element is Present");
			}
		else
			{
			System.out.println("Element is Absent");
			}
	}
	
}
}
