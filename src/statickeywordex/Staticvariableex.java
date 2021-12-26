package statickeywordex;

public class Staticvariableex {
	
	
  static int count=0 ;
               
  Staticvariableex()
  {
	  count++;
  }
  
  public void print()
  {
	  System.out.println(count);
  }

  public static void main (String[]arg)
  {
	  Staticvariableex e1= new Staticvariableex ();
	               e1.print();
	               
	         	  Staticvariableex e2= new Staticvariableex ();
	               e2.print();

	         	  Staticvariableex e3= new Staticvariableex ();
	               e3.print();

	               
	               
	               
  }
  
  
  
  
  
}
