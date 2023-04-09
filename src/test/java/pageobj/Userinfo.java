package pageobj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Userinfo {
	WebDriver driver;
	//constructor
	Userinfo(WebDriver d)
	{
		driver=d;
	}
	
	By Fname=By.id("first-name");
	By Lname=By.id("last-name");
	By Zcode=By.id("postal-code");
	By conti=By.id("continue");
	
	public void EnterFname(String firstname)
	{
		driver.findElement(Fname).sendKeys(firstname);
	}
	public void EnterLname(String lastname)
	{
		driver.findElement(Lname).sendKeys(lastname);
	}
	public void Enterzcode(String zip)
	{
		driver.findElement(Zcode).sendKeys(zip);
	}
	public void clickcontinue()
	{
		driver.findElement(conti).click();
	}
	
		
		
	}



