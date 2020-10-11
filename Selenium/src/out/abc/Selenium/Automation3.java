package out.abc.Selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automation3 {

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		System.out.println("Enter the Broswer");
		Scanner scan=new Scanner(System.in);
		String name=scan.next();
		if(name.equals("chrome"))
		{
			ChromeDriver c=new ChromeDriver();
			test(c);
		}
		else
		{
			FirefoxDriver f=new FirefoxDriver();
			test(f);
			
			
		}

	}
	public static void test(WebDriver driver)
	{
		driver.get("https://www.gmail.com");
		String temp=driver.getTitle();
		System.out.println(temp);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
	}

}
