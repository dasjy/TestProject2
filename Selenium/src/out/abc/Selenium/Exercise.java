package out.abc.Selenium;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise 
	
       {


	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
	Scanner sacn=new Scanner(System.in);
	System.out.println("enter the string");
	String a=sacn.nextLine();
	char ar[]=a.toCharArray();
	Arrays.sort(ar);
	String s=new String(ar);
	System.out.println("THE ENTERED STRING IS-"+s);
	String t="";
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>=65&&s.charAt(i)<=90||s.charAt(i)>=97&&s.charAt(i)<=122)
		{
			if(t.contains(""+s.charAt(i)))
			{
				
			}
			else
			{
				t=t+s.charAt(i);
			}
		}
	}
	System.out.println("NEW STRING IS -"+t);
	if(t.length()==26)
	{
		System.out.println("all char are presents");
	}
	else
	{
		System.out.println("not all chra are presents");
	}
	

}
	}