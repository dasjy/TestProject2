package out.abc.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automation12
{

	public static void main(String[] args) throws Exception
	{
		String url="http://www.echoecho.com/javascript4.htm";
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get(url);
		
		WebElement alertbox=driver.findElement(By.name("B2"));
		Thread.sleep(3000);;

		alertbox.click();
		Thread.sleep(3000);
		
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss(); ;
		
	}

}
