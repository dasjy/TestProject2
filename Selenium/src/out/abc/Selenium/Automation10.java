package out.abc.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation10 
{

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		String url="https://www.cleartrip.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to(url);;
		WebElement abc=driver.findElement(By.id("RoundTrip"));
		abc.click();
		
		WebElement from=driver.findElement(By.id("FromTag"));
		from.sendKeys("Bngalore");
		
		WebElement to=driver.findElement(By.id("ToTag"));
		to.sendKeys("bhubaneswar");
		
		WebElement date=driver.findElement(By.id("DepartDate"));
		date.sendKeys("sun,2 dec,2019");
		

		WebElement date2=driver.findElement(By.id("ReturnDate"));
		date2.sendKeys("sun,9 dec,2019");
		
		WebElement drop=driver.findElement(By.id("Adults"));
		
		Select s=new Select(drop);
		s.selectByIndex(2);
		
		WebElement drop1=driver.findElement(By.id("Childrens"));
		
		Select s1=new Select(drop1);
		s1.selectByIndex(2);
		
		WebElement drop2=driver.findElement(By.id("Infants"));
		
		Select s2=new Select(drop1);
		s1.selectByValue("1");
		
		
		
		
	}

}
