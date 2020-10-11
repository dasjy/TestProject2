package out.abc.Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class NewSel
{
	public static void main(String[] args) throws InterruptedException
	{
		@SuppressWarnings("unused")
		ChromeDriver driver=new ChromeDriver();
		driver.get("www.gmail.com");
		Thread.sleep(5000);
		driver.close();
		
		
	}
}
