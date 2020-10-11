package com.abc.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login
{
	WebDriver driver;
	By email=By.id("email");
	By pass=By.id("pass");
	By login=By.id("send2");
	
	public login(WebDriver driver)
	{
		this.driver=driver;
	}
	public void email()
	{
		driver.findElement(email).sendKeys("mzaidurrahman@gmail.com");
	}
	public void pass()
	{
		driver.findElement(pass).sendKeys("Welcome123");
	}
	public void login()
	{
		driver.findElement(login).click();
	}
}
