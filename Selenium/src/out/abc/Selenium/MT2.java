package out.abc.Selenium;
class Warrior extends Thread
{
	String res1="abc";
	String res2="ccd";
	String res3="def";
	
	public void run()
	{
		if(getName().equals("ram"))
		{
			rama_acess();
		}
		else if(getName().contentEquals("ravan"))
		{
			ravan_acess();
		}
			
	}
	
	public void rama_acess()
	{
		try
		{
			synchronized(res1) 
			{
				System.out.println("rama acess "+res1);
				Thread.sleep(7000);
				
				synchronized(res2)
				{
					System.out.println("rama acess "+res2);
					Thread.sleep(5000);
					
					synchronized(res3) 
					{
						System.out.println("rama aecss"+res3);
						Thread.sleep(7000);
					}
					
				}
			}
		} 
		catch (Exception e)
		{
			System.out.println("some problem has occured");
		}
	}
	
	public void ravan_acess()
	{
		try
		{
			synchronized(res1) 
			{
				System.out.println("ravan acess "+res3);
				Thread.sleep(7000);
				
				synchronized(res2)
				{
					System.out.println("ravan acess "+res2);
					Thread.sleep(5000);
					
					synchronized(res3) 
					{
						System.out.println("ravan aecss"+res1);
						Thread.sleep(7000);
					}
					
				}
			}
		} 
		catch (Exception e)
		{
			System.out.println("some problem has occured");
		}
	}
	

}
public class MT2 
{

	public static void main(String[] args) 
	{
		Warrior w=new Warrior();
		Warrior w1=new Warrior();
		
		w.setName("ram");
		w1.setName("ravan");
		
		w.start();
		w1.start();

	}

}
