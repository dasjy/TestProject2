package out.abc.Selenium;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;

public class Automation
{
@SuppressWarnings({ "unused", "resource" })
public static void main(String[] args) throws InterruptedException
	{
	/*System.out.println("enter the title");
	Scanner scan=new Scanner(System.in);
	String atitle="https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
	System.out.println("The actual Title="+atitle);*/
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.gmail.com");
	String etitle=driver.getPageSource();
	driver.manage().window().maximize();
	System.out.println("The excepted Title="+etitle);
	/*if (atitle.equalsIgnoreCase(etitle))
	{
	System.out.println("pass");	
	}
	else
	{
		
		System.out.println("fail");
	}*/
	}
}
