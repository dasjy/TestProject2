package out.abc.Selenium;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class prctc3 {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter t row");
		int row=scan.nextInt();
		int ar[]=new int[row];
		
		for (int i = 0; i < row; i++) 
		{
			ar[i]=scan.nextInt();
		}
		//System.out.println("Enter the length");
		//int l=scan.nextInt();
		String t="";
		abc:for(int l=ar.length;l>=0;l--) {
		
		for (int i = 0; i < ar.length-l; i++)
		{
			for (int j = i; j < i+l; j++)
			{
				t=t+ar[i];
			}
			if (isPal(t)) 
			{
				System.out.print("resulr"+t);
				break abc;
			}t="";
			
		}
	
		}	
	}
	static boolean isPal(String s)
	{
		StringBuffer sb=new StringBuffer();
		sb.reverse();
		return s.equals(""+sb);
		
	}

}
