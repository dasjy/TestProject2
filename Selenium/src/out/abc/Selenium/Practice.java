package out.abc.Selenium;

import java.util.Scanner;

public class Practice
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no");
		int n=scan.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
		if(j>=i &&j<=n-i-1)
		{
			System.out.print(i+1);
		}
		else if(j<=i &&j<=n-i-1)
		{
			System.out.print(j+1);
		}
		else if(j<=i && j>=n-i-1)
		{
			System.out.print(n-1-i+1);
		}
		else if(j>=i && j>=n-i-1)
		{
			System.out.print(n-1-j+1);
		}
			}
			
			System.out.println();
		}
	}

}
