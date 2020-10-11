package out.abc.Selenium;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automation2 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args)throws Exception
	{
		System.out.println("enter the broswer");
		Scanner scan=new Scanner(System.in);
		String name=scan.next();
		if(name.equals("chrome"))
		{
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.gmail.com");
			String temp=driver.getTitle();
			Thread.sleep(5000);
			System.out.println(temp);
		}
		else
		{
			FirefoxDriver driver=new FirefoxDriver();
			driver.get("https://www.gmail.com");
			String temp=driver.getTitle();
			System.out.println(temp);	
		}
	}

}
