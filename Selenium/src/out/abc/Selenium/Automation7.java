package out.abc.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation7
{
	public static void main(String[] args)
	{
		String url="https://account.magento.com/customer/account/create/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement fn=driver.findElement(By.id("firstname"));
		fn.sendKeys("jyoti ranjn ");
		
		WebElement ln=driver.findElement(By.id("lastname"));
		ln.sendKeys("das");
		
		WebElement email=driver.findElement(By.id("email_address"));
		email.sendKeys("ranjan.jyoti.2014@gmail.com");
		
		WebElement drop1=driver.findElement(By.id("country"));
		drop1.click();
		
		Select s=new Select(drop1);
		s.selectByIndex(15);
		
		WebElement drop2=driver.findElement(By.id("customer_company_type"));
		drop2.click();
		
		s.selectByIndex(2);
		
		WebElement drop3=driver.findElement(By.id("customer_individual_role"));
		drop3.click();
		
		s.selectByIndex(1);
		
		WebElement pss=driver.findElement(By.id("password"));
		pss.sendKeys("Welcome9124088012");
		
		WebElement cnpss=driver.findElement(By.id("confirmation"));
		cnpss.sendKeys("9124088012");
		
		
		
		
		
		
		
		
		
		
		
	}
}
