package out.abc.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automation14 {

	public static void main(String[] args) 
	{
		String url="https://cleartrip.com";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(url);
		WebElement search = driver.findElement(By.id("FromTag"));
		
		Actions a=new Actions(driver);
		a.moveToElement(search).click().sendKeys("tri").sendKeys(Keys.ARROW_DOWN).pause(3000).sendKeys(Keys.ARROW_DOWN).
		sendKeys(Keys.ARROW_DOWN).
		pause(3000).sendKeys(Keys.ENTER).build().perform();
	
		

	}


}
