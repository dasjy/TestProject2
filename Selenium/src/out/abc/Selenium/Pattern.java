package out.abc.Selenium;

import java.util.Scanner;

public class Pattern
{

	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no");
		int n=scan.nextInt();
		int c=n;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			if(j>=n-i-1)
			{
				System.out.print(n);
				n=n-1;
				
			}
			else
			{
				System.out.print(" ");
			}
		
			}
			System.out.println();
		}
		
			
		}

	}


