package out.abc.Selenium;

public interface Lunch90
{
void add(int a,int b);
}
class  Lunch
{
	public static void main(String[] args)
	{
		Lunch90 s=(a,b)->{
			int c=a+b;
			System.out.println(c);
			
		              };
		              s.add(10, 99);
	}
}
