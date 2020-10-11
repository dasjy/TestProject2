package out.abc.Selenium;

import java.util.Arrays;
import java.util.Scanner;
interface Sample
{
	static void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
}
public class Exercise1 {

	public static void main(String[] args) 
	{
		Sample.add(10, 10);
	}

}
