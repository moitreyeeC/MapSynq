package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import Utility.DriverBuilder;
import junit.framework.Assert;

public class personal extends DriverBuilder {
@FindBy(xpath="//a[@class='tab_button me_tab sprite']")WebElement personal_tab;
@FindBy(xpath="//input[@value='Register']")WebElement register_button;
@FindBy(xpath="//input[@id='profile_first_name']")WebElement FirstName;
@FindBy(xpath="//input[@id='profile_dob']")WebElement DOB;
@FindBy(xpath="//input[@value='Create Profile']")WebElement Create;

	public personal(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
public void register() throws InterruptedException
{
	driver.findElement(By.xpath("//div[@id='ad_toggle']")).click();
	personal_tab.click();
	register_button.click();
	Thread.sleep(3000);
	DOB.click();
	WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	Select monthCombo = new Select(month);
	monthCombo.selectByVisibleText("Mar");
	Thread.sleep(3000);
	WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	Select yearCombo = new Select(year);
	yearCombo.selectByVisibleText("2015");
	Thread.sleep(3000);
	driver.findElement(By.linkText("31")).click();
	Create.click();
	String pleasefilloutthisfield = FirstName.getAttribute("required");
	System.out.println("text is:"+pleasefilloutthisfield);
	String value="Please fill out this field";
	SoftAssert softAssert = new SoftAssert();
	softAssert.assertEquals(value, pleasefilloutthisfield);
	driver.findElement(By.linkText("BACK")).click();
	

//	private boolean isTextPresent(String text){
//        try{
//            boolean b = driver.getPageSource().contains(text);
//            return b;
//        }
//        catch(Exception e){
//            return false;
//        }
  }
}
	

