package exceptionhandling;

public class Throwexample {

	public static void validate(int age)
	{
		if (age<18)
		{
			throw new ArithmeticException("person not elligible");
		}
		else 
		{
			System.out.println("person is elligilbe for vote!!");
		}
		
		
	}
	
	public static void main(String[]arg) 
	{
		validate(20);
	}
}
