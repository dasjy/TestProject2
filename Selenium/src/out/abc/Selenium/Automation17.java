package out.abc.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation17
{

	public static void main(String[] args)
	{
		int sum=0;
		String url="file:///C:/Users/JYOTI%20RANJAN/Desktop/table3.html";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
		driver.get(url);
		
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr"));
		int rsize=row.size();
		System.out.println("No of rows is: "+rsize);

		List<WebElement> col = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		int csize=col.size();
		System.out.println("No of col is: "+csize);
		

		System.out.println("The subjects are");;
		for (int i = 1; i <= rsize; i++)
		{
		WebElement elem = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]"));
		System.out.println(elem.getText());
		}
		
		for (int i = 1; i <= rsize; i++)
		{
		WebElement elem = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]"));
		String text=elem.getText();
		sum=sum+Integer.parseInt(text);
		}
		System.out.println("Total mark is: "+sum);

		System.out.println("3rd Students name,Marks are;");
		 List<WebElement> elem = driver.findElements(By.xpath("//table/tbody/tr[3]/td[2] |//table/ tbody/tr[3]/td[4]"));
		 for (WebElement a:elem)
		 {
			System.out.println(a.getText());
		}
	}
	
	

}
