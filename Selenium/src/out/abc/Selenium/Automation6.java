package out.abc.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation6 {

	public static void main(String[] args) throws InterruptedException
	{
		String url="https://www.magento.com";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		WebElement act=driver.findElement(By.linkText("My Account"));
		act.click();
		Thread.sleep(5000);
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("mzaidurrahman@gmail.com");
		
		WebElement pas=driver.findElement(By.id("pass"));
		pas.sendKeys("Welcome123");
		
		WebElement lg=driver.findElement(By.className("button"));
		lg.click();
		Thread.sleep(5000);
		
			WebElement lo=driver.findElement(By.linkText("Log Out"));
			lo.click();
			
			driver.close();
	}

}
