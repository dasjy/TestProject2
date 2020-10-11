package out.abc.Selenium;

import java.util.Scanner;

public class prctc2 {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a row");
		int row=scan.nextInt();
		System.out.println("enter col");
		int col=scan.nextInt();
		
		int ar[][]=new int[row][col];
		int br[][]=new int[row][col];
		if(row==col)
		{
			System.out.println("Squre matrix");
			
			System.out.println("Enter the matrix");
			for (int i = 0; i < row; i++) 
			{
				for (int j = 0; j <col; j++)
				{
					ar[i][j]=scan.nextInt();
				}
			}
			int k=2;
			for (int i = 0; i < row; i++) 
			{
				
				for (int j = 0; j <col; j++)
				{
					
					br[i][j]=ar[i][j];
					
				}
				//k--;
			}
			System.out.println("Result ");
			for (int i = 0; i < row; i++) 
			{
				for (int j = 0; j <col; j++)
				{
					System.out.print(br[i][j]+" ");
					
				}
				System.out.println();
			}
			
		}
		else
		{
		System.out.println("Not a squre matrix");
		}
		
		
		
		

	}

}
