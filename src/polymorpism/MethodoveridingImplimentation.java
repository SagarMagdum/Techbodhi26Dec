package polymorpism;

public class MethodoveridingImplimentation extends Methodoveriding {
	

	 public void test()
     {
		 super.test();
     	System.out.println("child class");
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoveriding mo= new MethodoveridingImplimentation();
		      mo.test();
		      MethodoveridingImplimentation mr= new MethodoveridingImplimentation();
		      mr.test();

	}

}
