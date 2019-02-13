package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.DriverBuilder;

public class Live extends DriverBuilder {

	public Live(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
@FindBy(xpath="//h2[contains(text(),'Incidents')]")WebElement Incident;
@FindBy(xpath="//h2[contains(text(),'Cameras')]")WebElement Cameras;
@FindBy(xpath="//h2[contains(text(),'Tolls')]")WebElement Tolls;
@FindBy(xpath="//a[@class='refresh']")WebElement refresh;
@FindBy(xpath="//input[@id='txtSearchIncidentsingapore']")WebElement SearchIncident;
WebDriverWait wait = new WebDriverWait(driver, 30);




public void incident() throws InterruptedException
{
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Incidents')]")));
	if(Incident.isDisplayed())
	{
		refresh.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtSearchIncidentsingapore']")));
		SearchIncident.click();
		SearchIncident.clear();
		SearchIncident.sendKeys("Changi Airport");
		Select date=new Select (driver.findElement(By.xpath("//select[@id='selIncidentDays']")));
		Thread.sleep(2000);
		date.selectByIndex(0);
	}
	
}

public void camera() throws InterruptedException
{
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Cameras')]")));
	Cameras.click();
	driver.findElement(By.xpath("//div[@id='ad_toggle']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(text(),'Alexandra Road (Towards MCE)')]")).click();
}

public void toll() throws InterruptedException
{
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Tolls')]")));
	Tolls.click();
	driver.findElement(By.xpath("//div[@id='ad_toggle']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(text(),'Beach Road')]")).click();	
}

}
