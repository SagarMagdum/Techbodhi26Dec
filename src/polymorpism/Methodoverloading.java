package polymorpism;

public class Methodoverloading {

	public float add(int a, int b)
	{
		System.out.println(a+b);
		
		return a+b;
	}
	
	public float add(float a, float b)
	
	{
		System.out.println(a+b);

		return a+b;
	}
	public float add(int a, int b , int c)
	{
		System.out.println(a+b+c);
		return a+b+c;
		
	}
	
	
	public static void main(String[] args) {
		
		Methodoverloading abc=new Methodoverloading();
		  abc.add(5.5f, 5.5f);
		  abc.add(5, 5);
		  abc.add(5, 5, 5);		  
				
		// TODO Auto-generated method stub
		
		
		

	}

}
