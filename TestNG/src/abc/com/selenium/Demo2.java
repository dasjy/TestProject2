package abc.com.selenium;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2
{
@Test
public void login()
{
	Assert.fail();
	System.out.println("login get executed");
	
}
@Test(invocationCount=3)
public void send()
{
	System.out.println("send will executed");
	
}
@Test(enabled=false)
public void compose()
{
	System.out.println("compose will  executed");
	
}
@Test(dependsOnMethods="login",alwaysRun=true)
public void logout()
{
	System.out.println("logout will executed");
	
}

}
