package out.abc.Selenium;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automation16 {

	public static void main(String[] args)
	{
		String url="https://gmail.com";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		WebElement mail = driver.findElement(By.id("identifierId"));
		
		Actions a=new Actions(driver);
		a.moveToElement(mail).click().sendKeys("ranjan.jyoti.2014@gmail.com").sendKeys(Keys.ENTER).build().perform();;
		
		/*Set<String> allids = driver.getWindowHandles();
		ArrayList<String>al=new ArrayList<String>();
		driver.switchTo().window(al.get(1));*/
		
		WebElement pass = driver.findElement(By.name("password"));
	//	Actions b=new Actions(driver);
		//b.moveToElement(pass).click().sendKeys("babul@321").sendKeys(Keys.ENTER).build().perform();
		pass.sendKeys("babul@321");
		WebElement next=driver.findElement(By.xpath("//span[text()='Next']"));
		next.click();
		
		WebElement com=driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']"));
		com.click();
		
		WebElement to=driver.findElement(By.id(":r0"));
		to.sendKeys("callmedevilbuddy@gmail.com");
		
		WebElement sub=driver.findElement(By.id(":xt"));
		sub.sendKeys("requitment process");
		
		WebElement context=driver.findElement(By.id(":1dk"));
		context.sendKeys("hi how are you ,you got selected");
		
		WebElement snd=driver.findElement(By.id(":14u"));
		snd.click();
		
		
				
	}

}
