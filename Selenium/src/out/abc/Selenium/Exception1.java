package out.abc.Selenium;

import java.util.Scanner;

@SuppressWarnings("serial")
class Invalid extends Exception
{
public String getMessage()
   {
	return "invlid";
	}
}
class Atm
{
	private int acc=123;
	private int pwd=321;
	int account;
	int pass;
	
	@SuppressWarnings("unused")
	public void acceptInput()
	{
	
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the account no");
		int account=scan.nextInt();
		System.out.println("Enter the password");
		int pass=scan.nextInt();
		
	}
	public void verify() throws Invalid
	{
		if(acc==account && pwd==pass)
		{
			System.out.println("collect your money");
			System.exit(0);
		}
		else
		{
			Invalid i=new Invalid();
			throw i;
					
		}
	}
}
class Bank
{
	public void initial()
	{
		Atm m=new Atm();
		try
		{
			m.acceptInput();
			m.verify();
		}
		catch(Exception e)
		{
			try
			{
				System.out.println("invalid account no or password try again");
				m.acceptInput();
				m.verify();
			}
			catch(Exception f)
			{
				try
				{
					System.out.println("invalid account no or password try again");	
					m.acceptInput();
					m.verify();
				}
				catch(Exception g)
				{
					System.out.println("card blocked for 1 days");
					System.exit(0);
				}
				
			}
		}
	}
}
public class Exception1 
{

	public static void main(String[] args)
	{
		
Bank b=new Bank();
b.initial();
	}

}
