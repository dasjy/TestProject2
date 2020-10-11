package out.abc.Selenium;
public class Launch
{
	int a=99;

}
class Launch2 extends Launch
{
	int a=999;
	void disp()
	{
	System.out.println(a);	
		
	}
}
class Launch23
{
public static void main(String[] args)
{
Launch2 a=new Launch2();
a.disp();
	}
}