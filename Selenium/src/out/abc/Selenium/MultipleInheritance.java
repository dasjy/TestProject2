package out.abc.Selenium;

interface A
{
	 void mul();
}
interface B
{
	void div();
}
class C implements A,B
{
public void mul()
{
	int a=9,b=9;
	int c=a*b;
	System.out.println(c);
	
}
public void div()
{
	int a=9,b=9;
	int c=a/b;
	System.out.println(c);
}

}
class Math
{
	void permit(A a,B b)
	{
		a.mul();
		b.div();
	}
}

public  class MultipleInheritance 
{

	public static void main(String[] args) 
	{
	C c=new C();
	Math m=new Math();
	m.permit(c, c);
	
	
	

	}

}
