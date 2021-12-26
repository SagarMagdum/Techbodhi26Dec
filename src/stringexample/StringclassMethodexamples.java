package stringexample;

public class StringclassMethodexamples {

	public StringclassMethodexamples() {
		// TODO Auto-generated constructor stub
		
	}
	
	public void StringMethod()
	{
		String s="Sagar";
		
		  int a =	s.length();
		  System.out.println(a);
		  
		  char c = s.charAt(1);
		  System.out.println(c);
		  
		String ss = s.substring(2);
		System.out.println(ss);
		
		String bb = s.substring(2,4);
		System.out.println(bb);
		
		String s1="sagar";
		String s2="sagar";
	boolean b =	s1.equals(s2);
	System.out.println(b);
		
	int cc= s1.indexOf("a");
	System.out.println(cc);	
		
	int dd= s1.lastIndexOf("a");
	System.out.println(dd);
	
	  String x= s1.replace("sagar","shubhangi");
		System.out.println(x);
	}

}
