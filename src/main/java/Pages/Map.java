package Pages;



import java.awt.Image;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.asprise.ocr.*;

import Utility.DriverBuilder;

public class Map extends DriverBuilder {

	public Map(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
@FindBy(xpath="//a[contains(text(),'Legend')]")WebElement Legend;

	WebDriverWait wait = new WebDriverWait(driver, 30);
	public void map() throws InterruptedException, IOException
	{
		//driver.switchTo().frame(0);
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@id='QiPanZoomBar_2_zoomout_innerImage']")));
			WebElement slider = driver.findElement(By.xpath("//img[@id='QiPanZoomBar_2_zoomout_innerImage']")); 
			for(int i=0;i<10;i++)
			{
				slider.click();
				Thread.sleep(1000);
			}
		}catch (TimeoutException e) {
		    System.out.println(e.toString());
		} 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Legend')]")));
		Legend.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#OpenLayers.Geometry.Point_1216")));
		WebElement point= driver.findElement(By.cssSelector("#OpenLayers.Geometry.Point_1216"));
		point.click();

}
}
