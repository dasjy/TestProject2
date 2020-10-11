package out.abc.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automation15 
{

	public static void main(String[] args) 
	{
		String url="https://www.google.com";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		WebElement ele = driver.findElement(By.name("q"));
		
		Actions a=new Actions(driver);
		a.moveToElement(ele).click().keyDown(Keys.SHIFT).sendKeys("abc").keyUp(Keys.SHIFT).
		sendKeys("for technology training").sendKeys(Keys.ENTER).build().perform();
	}

}
