package com.abc.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class main 
{
	WebDriver driver;
By logout=By.linkText("Log Out");

public main(WebDriver driver)
	{
	this.driver=driver;
	}
public void logout()
{
driver.findElement(logout).click();	
}
}
