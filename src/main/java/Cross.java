import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cross {
	WebDriver driver;
	@BeforeMethod
	public void Lunchbrouser()
	{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@Test
	public void VarifyTitle()
	{
		driver.get("https://www.google.com");	
		String expectedTitle="Google";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	@AfterMethod
	public void Quit()
	{
		driver.quit();
	}
}
