package out.abc.Selenium;

import java.util.Arrays;
import java.util.Scanner;

public class prctc5 {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		int ar[]= new int[size];
		System.out.println("Enter the array");
		for (int i = 0; i <size; i++)
		{
			ar[i]=scan.nextInt();
		}
		int n=ar.length;
	
	booblesort(ar,n);
	
	display(ar,n);
	
	
		
	}
	static void booblesort(int ar[],int n)
	{
		int temp;
		for (int i = 0; i <=n-2; i++)
		{
			for (int j = 0; j <=n-2-i; j++)
			{
				if(ar[j]>ar[j+1])
				{
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		
	}
	static void display(int ar[],int n)
	{
		for (int i = 0; i <=n-1; i++)
		{
		System.out.print(ar[i]+" ");	
		}
		System.out.println();
	}
}

	


	
	

