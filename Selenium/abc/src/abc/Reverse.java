package abc;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of Array");
		int row =scan.nextInt();
		
		int arr[]=new int[row];
		System.out.println("Enter the Array Elements");
		for (int i = 0; i <row; i++)
		{
			arr[i]=scan.nextInt();
			
		}
		System.out.println("Giver Array is:");
		printArray(arr,row);
		
		rearrangeArray(arr,row);
		System.out.println("Reaarage arry is");
		printArray(arr,row);
		 
	}
	static void rearrangeArray(int arr[],int n)
	{
		int i=-1;
		int j=n;
		while(i<j)
		{
			while(arr[++i]>0);
			while(arr[--j]<0);
			if(i<j)
				swap(arr,i,j);
		}
		if(i==0 ||i==n)
			return;
		int k=0;
		while(k<n && i <n)
		{
			swap(arr,k,i);
			i=i+1;
			k=k+2;
		}
		
	}
	static void printArray(int arr[],int n)
	{
		for (int k2 = 0; k2 <n; k2++)
		{
			System.out.print(arr[
			                     k2]+" ");
			
		}
		System.out.println();
	}
static void swap(int arr[], int index1,int index2)
{
	int c=arr[index1];
	arr[index1]=arr[index2];
	arr[index2]=c;
	}

}
