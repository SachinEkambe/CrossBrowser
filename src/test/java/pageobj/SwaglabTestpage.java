package pageobj;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwaglabTestpage {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		// Logger Log=(Logger) LogManager.getLogger("SwaglabTestpage"); 
		
		Loginpage logpg=new Loginpage(driver);		
		Productpage propg=new Productpage(driver);
		Addtocart rt=new Addtocart(driver);
		Userinfo info=new Userinfo(driver);
		Finishpage finish=new Finishpage(driver);

		driver.get("https://www.saucedemo.com/");
		
		logpg.Enterusername("standard_user");
		logpg.Enterpassword("secret_sauce");
		logpg.clickloginbtn();
		Thread.sleep(2000);
		
		propg.selectproduct1();
		propg.selectproduct2();
		propg.clickcart();
		Thread.sleep(2000);
		
		rt.clickcheckout();
		Thread.sleep(2000);
		
		info.EnterFname("sachin");
		info.EnterLname("ekambe");
		info.Enterzcode("431741");
		
		Thread.sleep(2000);
		info.clickcontinue();
		
		Thread.sleep(2000);
		finish.clickonfinishbtn();
		
	}



	

	

}
