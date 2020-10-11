package out.abc.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation4 {

	public static void main(String[] args)
	{
	String url="https://accounts.shopify.com/store-login";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	WebElement email=driver.findElement(By.id("shop_domain"));
	email.sendKeys("babul@123");
	}

}
