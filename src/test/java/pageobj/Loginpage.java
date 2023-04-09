package pageobj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
	WebDriver driver;
	//constructor
	Loginpage(WebDriver d)
	{
	driver=d;
	}
 //use for pom
	By Byabhijit=By.id("user-name");
	By password=By.id("password");
	By loginbtn=By.id("login-button");
	
	public void Enterusername(String uname)
	{
		driver.findElement(Byabhijit).sendKeys(uname);
	}
	public void Enterpassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	public void clickloginbtn()
	{
		driver.findElement(loginbtn).click();
	}
}
