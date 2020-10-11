package out.abc.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation5 {

	public static void main(String[] args) 
	{
		String url="https://www.facebook.com";
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		WebElement email=driver.findElement(By.cssSelector("input[id^='em']"));
		email.sendKeys("ac@gmail.com");
	}
}
