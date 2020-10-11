package abc;

public class ccd
{
public static void main(String[] args)
	{
	int arr[]= {1,-2,3,4,-5,-9};
	int n=arr.length;
	System.out.println("Given Array is:");
	printArray(arr,n);
	
	rearrangeArray(arr,n);
	
	System.out.println("The Reaaanged Array is");
	printArray(arr,n);
	}
	static void rearrangeArray(int arr[],int n)
	{
		int i=-1;
		int j=n;
		while(i<j)
		{
			while (arr[++i] > 0); 
			while (arr[--j] < 0); 
			if (i < j) 
				swap(arr, i,j); 
		}
		if(i==0||i==n)
			return;
					
					
		int  k = 0;
		while(k<n && i<n)
		{
			swap(arr,k,i); 
			i = i + 1; 
			k = k + 2; 
		}
			
	}
	
	static void printArray(int arr[],int n)
	{
		for (int i = 0; i <n; i++) 
		{
			System.out.print(arr[i]+" ");
			
			
		}
		System.out.println();
	}
	static void swap(int arr[], int index1, int index2){ 
		int c = arr[index1]; 
		arr[index1]=arr[index2]; 
		arr[index2]=c; 
	} 
}
