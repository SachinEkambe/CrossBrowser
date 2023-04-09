package pageobj;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Productpage {
	WebDriver driver;
	//constructor
	Productpage(WebDriver d){
		driver=d;
	}
	By selectpro1=By.id("add-to-cart-sauce-labs-backpack");
	By selectpro2=By.id("add-to-cart-sauce-labs-bike-light");
	By cart=By.className("shopping_cart_link");
	
	public void selectproduct1()
	{
		driver.findElement(selectpro1).click();
	}
	public void selectproduct2()
	{
		driver.findElement(selectpro2).click();
	}
	public void clickcart()
	{
		driver.findElement(cart).click();
	}
}
