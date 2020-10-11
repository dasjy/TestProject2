package out.abc.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation11 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String url="file:///C:/Users/JYOTI%20RANJAN/Desktop/PAGE2.HTML";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get(url);
		
		WebElement last=driver.findElement(By.id("lname"));
		last.sendKeys("DAS");
		Thread.sleep(3000);
		
		driver.switchTo().frame("fname");
		WebElement first=driver.findElement(By.id("fname"));
		first.sendKeys("JYOTI RANJAN");
		Thread.sleep(3000);;
		
		driver.close();
		
	}

}
