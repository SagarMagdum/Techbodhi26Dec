package statickeywordex;

public class Staticmethodexa {
	
	public static void main(String[]arg)
	{
		Staticmethodexa.printb();
   		System.out.println(b);

		Staticmethodexa aa= new Staticmethodexa();
		               aa.printa();
		       		System.out.println(aa.a);

	}
	
	int a=10;
	static int b=12;
	
	
	public void printa()
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static void printb()
	{
		
		System.out.println(b);
	}
	

}
