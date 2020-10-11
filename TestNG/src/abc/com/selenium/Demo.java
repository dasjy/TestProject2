package abc.com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo
{
	@Test
	public void testcase()
	{
		String url="https://www.magento.com";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		
		driver.findElement(By.xpath("//a[text()='My Account']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mzaidurrahman@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Welcome123");
		driver.findElement(By.xpath("//button[@id='send2']")).click();
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		
		driver.close();
	}
	
	@Test
	
	public void testcase2()
	{
		String url="https://www.magento.com";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		
		driver.findElement(By.xpath("//a[text()='My Account']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nithya.27.v@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Welcome123");
		driver.findElement(By.xpath("//buttomn[@id='send2']")).click();
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		
		driver.close();
	}
	
}
