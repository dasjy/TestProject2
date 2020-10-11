package out.abc.Selenium;
class Bathroom implements Runnable
{
synchronized public void run()
	{
		try {
			System.out.println(Thread.currentThread().getName()+"enter the bathroom");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+"uyse the bathroom");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+"exit the bathroom");
			Thread.sleep(5000);
		   }
		catch (Exception e)
		{
			System.out.println("Some problem has occured");
		}
	}
}
public class MT 
{

	public static void main(String[] args)
	{
		Bathroom b=new Bathroom();
		
		
		Thread t=new Thread(b);
		Thread t1=new Thread(b);
		Thread t2=new Thread(b);
		t.setName("boy");
		t1.setName("girl");;
		t2.setName("others");
		t.start();
		t1.start();
		t2.start();

	}

}
