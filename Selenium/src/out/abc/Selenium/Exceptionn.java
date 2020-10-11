package out.abc.Selenium;

import java.sql.SQLException;

class Demo
{
	void add()throws SQLException
	{
		System.out.println("inseid demo"
				+ "");
	}
}
class Demo1 extends Demo
{
	void add() throws SQLException
	{
		System.out.println("indise demo1");
	}
}
public class Exceptionn {

	public static void main(String[] args) throws SQLException
	{
		Demo d=new Demo1();
		d.add();

	}

}
