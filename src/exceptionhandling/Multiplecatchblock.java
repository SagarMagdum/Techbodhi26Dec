package exceptionhandling;

public class Multiplecatchblock {

	public static void main(String[] args) {
		
		try {
			int a[]= new int [5];
			a[4]=67/0;
			System.out.println("try block");
			
		}
        catch(ArithmeticException e)
		{
			System.out.println("task one complete");

		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("task two complete");

		}
		catch(Exception e) 
		{
			System.out.println("task  complete");

		}
		finally
		{
			System.out.println("Finally	");

		}
		}
	}


