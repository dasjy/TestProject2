package out.abc.Selenium;

import java.util.Arrays;
import java.util.Scanner;

public class Autoamtion 
{
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Row Size");
		int row=scan.nextInt();
		int a[]=new int[row];
		System.out.println("Enter the elements");
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=scan.nextInt();
		}
		System.out.println("The Array is:");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" " );
		}
		System.out.println();
		System.out.println("Enter the char");
		int c=0;
		int b=scan.nextInt();
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==b)
			{
				c++;
			}
			
		}
		System.out.println("The char"+  b +"Has repeated:"+c+" times");
	}
}
