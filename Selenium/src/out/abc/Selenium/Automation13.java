package out.abc.Selenium;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation13 
{

	public static void main(String[] args) throws InterruptedException
	{
		String url="file:///C:/Users/JYOTI%20RANJAN/Desktop/page1.html";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(url);
		
		WebElement link=driver.findElement(By.linkText("goto page2"));
		link.click();
		String parentid=driver.getWindowHandle();
		System.out.println(parentid);
		
		Set<String> allids = driver.getWindowHandles();
		System.out.println(allids);
		
		/*for(String a:allids)
		{
		driver.switchTo().window(a);
		}*/
		
		ArrayList<String>al=new ArrayList<String>(allids);
		driver.switchTo().window(al.get(1 ));
		
		WebElement link2=driver.findElement(By.linkText("goto_page3"));
		link2.click();
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}
