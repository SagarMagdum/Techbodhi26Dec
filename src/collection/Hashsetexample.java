package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetexample {

	public static void main(String[] args) 
	{
		HashSet<String> set= new HashSet();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		
     Iterator<String> i=set.iterator();
   	System.out.println(i.hasNext());
   	
	}

}
