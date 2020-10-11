
package out.abc.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AAutomation2
{

	public static void main(String[] args) throws InterruptedException
	{
		String url="https://www.magento.com";
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(url);
		WebElement myact=driver.findElement(By.linkText("My Account"));
		myact.click();
		Thread.sleep(5000);;
		WebElement reg=driver.findElement(By.className("button"));
		reg.click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().forward();
		
	}

}
