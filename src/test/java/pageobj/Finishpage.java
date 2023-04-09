package pageobj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Finishpage {
    WebDriver driver;
    //constructor
    Finishpage(WebDriver d) {
    	driver=d;
	}
    
    By clickfinish=By.id("finish");
    
    public void clickonfinishbtn()
    {
    	driver.findElement(clickfinish).click();
    }
    
}
