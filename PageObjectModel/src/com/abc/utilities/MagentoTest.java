package com.abc.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.selenium.login;
import com.abc.selenium.welcome;

public class MagentoTest {

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		
		welcome w=new welcome(driver);
		w.clickOnLogin();
		
		login l=new login(driver);
		l.email();
		l.pass();
		l.login();
		
		com.abc.selenium.main m=new com.abc.selenium.main(driver);
		m.logout();
		
		
		
		
	}

}
