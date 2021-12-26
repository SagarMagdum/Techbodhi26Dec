package supervariables;

public class Supervariableimplimentation extends Supervariables1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supervariableimplimentation ss= new Supervariableimplimentation();
		                  ss.display();
		
	}
		String abc="i am in a child class";

		public void display()
		   {
			  System.out.println(abc); 
			  System.out.println(super.abc); 

		   }

	
}
