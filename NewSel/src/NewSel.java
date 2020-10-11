import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewSel
{
	public static void main(String[] args) throws InterruptedException
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.magento.com");
		Thread.sleep(6000);;
		WebElement myact=driver.findElement(By.linkText("My Account"));
		myact.click();
		Thread.sleep(8000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		
		
	}
}
