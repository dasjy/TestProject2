package out.abc.Selenium;

import java.util.Scanner;
class abc
{
	static void pairarray(int ar[],int n,int sum)
	{
		int a=0;
		System.out.println("Sum of the pair of the no "+sum +"-are:");
		for (int i = 0; i < ar.length; i++)
		{
			for (int j = i+1; j < ar.length; j++)
			{
				if (ar[i]+ar[j]==sum)
				{
					a+=1;
					System.out.println("("+ar[i]+","+ar[j]+")");
				}
			}
		}
		System.out.println("Total no of pairs are:   "+a);
	}
}
public class prctc4
{
	@SuppressWarnings({ "resource", "static-access" })
	public static void main(String[] args)
	
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=scan.nextInt();
		System.out.println("Enter the Array:");
		int ar[]=new int[size];
		for (int i = 0; i < size; i++)
		{
			ar[i]=scan.nextInt();
		}
		int n=ar.length;
		System.out.println("Enter the no:");
		int sum=scan.nextInt();
		
		abc c=new abc();
		c.pairarray(ar,n,sum);
	}
	
}

