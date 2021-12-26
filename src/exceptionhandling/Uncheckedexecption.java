package exceptionhandling;


public class Uncheckedexecption {
	public static void main(String[] args) 
	{
     try { 
    	 int array[]= {1,2,4,5};
    	 System.out.println(array[7]);
     }
     catch( ArrayIndexOutOfBoundsException e ) 
     {
    	 
     }
	}
		
}
