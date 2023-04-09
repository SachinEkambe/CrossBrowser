package pageobj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Addtocart {
	WebDriver driver;
	Addtocart(WebDriver d)
	{
		driver=d;
	}
	
	
	By checkout=By.id("checkout");
	
	
	public void clickcheckout()
	{
		driver.findElement(checkout).click();
	}

}
