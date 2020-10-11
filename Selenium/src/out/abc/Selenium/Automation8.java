package out.abc.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation8
{

	public static void main(String[] args)
	{
		String url="https://www.magento.com";
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		WebElement ele=driver.findElement(By.className("demo-enter"));
		ele.click();
		

	}

}
