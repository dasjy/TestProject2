package com.abc.Magento;

import java.sql.SQLException;
import java.util.HashMap;

public class MagentoTest
{

	String name;
	int mark;
	int mark2;
	public MagentoTest(String name, int mark, int mark2)
	{
		super();
		this.name = name;
		this.mark = mark;
		this.mark2 = mark2;
	}


	

	public static void main(String[] args) 
	{
		MagentoTest s=new MagentoTest("a",20,23);
		MagentoTest s1=new MagentoTest("b",20,23);
		
		HashMap hm=new HashMap();
		hm.put(s, 21);
		hm.put(s1, 21);
		System.out.println(hm);
		
		
		

	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMark() {
		return mark;
	}


	public void setMark(int mark) {
		this.mark = mark;
	}


	public int getMark2() {
		return mark2;
	}


	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}
	

}
