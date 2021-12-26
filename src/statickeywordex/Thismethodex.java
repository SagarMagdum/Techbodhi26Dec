package statickeywordex;

public class Thismethodex {
	
	public void method1()
	{
		System.out.println("Shubdum");
		
	}
	
	
	public void method2()
	{
		this.method1();
		System.out.println("sagar");
		
	}

public static void main(String[]arg)
{
	Thismethodex abc= new Thismethodex();
	   abc.method2();
}
	
}
