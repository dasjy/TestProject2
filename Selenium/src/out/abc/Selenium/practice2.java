package out.abc.Selenium;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no");
		int n=scan.nextInt();
		int c=1;

		for(int i=0;i<n;i++)
		{
			

			for(int j=0;j<n;j++)
			{
				if(j<=n-i-1)
				{
					System.out.print(" ");
				}
				
			}
			
			for(int j=0;j<n;j++)
			{
				if(j<=i)
				{
					System.out.print(fact(i)/(fact(i-j)*fact(j))+" ");
				}
				
			}
			System.out.println();
			
		}

	}
	static int fact(int n) 
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return n*fact(n-1);
		}
	}

}
