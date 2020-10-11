package out.abc.Selenium;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MaxChar {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the String");
		String s=scan.nextLine();
		char ar[]=s.toCharArray();
		int size=ar.length;
		Map<Character,Integer> map=new LinkedHashMap<>();
		int i=0;
		while(i!=size)
		{
			if(map.containsKey(ar[i])==false) 
			{
				map.put(ar[i],1);
			}
			else
			{
				int oldval=map.get(ar[i]);
				int newval=oldval+1;
				map.put(ar[i],newval);
			}
			++i;
		}
		Set<Map.Entry<Character,Integer>> hm=map.entrySet();
		char maxkey=' ';
		int maxval=0;
		for(Map.Entry<Character,Integer>data:hm)
		{
			
			if(data.getValue()>maxval)
			{
				maxval=data.getValue();
				maxkey=data.getKey();
			}
		}
		System.out.println(maxval);
		System.out.println(maxkey);
		
	}

}
