package out.abc.Selenium;

import java.util.Scanner;

public class Fcatoril
{

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no");
		int x=scan.nextInt();
		System.out.println("Enter the range");
		int n=scan.nextInt();
		
		System.out.println("Result:"+sum(x,n));

	}
	static double sum(double x,double n)
	{
		double sum=1,term=1,fct=1;
		double p=1,multi=1;
		
		for (int i = 0; i <n ;i++) 
		{
			fct=fct*multi*(multi+1);
			p=p*x*x;
			term=(-1)*term;
			multi+=2;
			sum=sum+(term*p)/fct;
			
			
		}return sum;
	}
}
