package out.abc.Selenium;


import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DeadLock 
{
	static String s;
	public static void main(String args[]) 
	{
		 int a=4;
		 int c=1;
		for (int i = 0; i <a; i++)
		{
			for (int j = 0; j < a; j++) 
			{
			  if (j<=i) 
			  {
				System.out.print(c++ +" ");
			  }
			}
			//System.out.println();
			

			for (int j = 0; j < a; j++) 
			{
			  if (j>=i) 
			  {
				System.out.print("*");
			  }
			}
			System.out.println();
		}
	}
}
