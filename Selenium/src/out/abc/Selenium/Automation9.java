package out.abc.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automation9 
{

	public static void main(String[] args) throws InterruptedException
	{
		String url="https://www.magento.com";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url);
		
		WebElement myact=driver.findElement(By.linkText("My Account"));
		myact.click();
		
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("mzaidurrahman@gmail.com");;
		
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("Welcome123");
		
		WebElement login=driver.findElement(By.id("send2"));
		login.click();
		
		//WebElement logout=driver.findElement(By.linkText("Log Out"));
		//logout.click();
		
		WebDriverWait wait=new WebDriverWait(driver,40);
		WebElement logout=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log Out")));
		logout.click();
		
	//	driver.close();
		
		
	}

}
