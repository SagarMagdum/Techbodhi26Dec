package exceptionhandling;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

	public static void main(String[] args) 
	{
      List<Integer>ab= new LinkedList<Integer>();
      
      ab.add(18);
      ab.add(14);
      ab.add(11);
      
    Iterator<Integer>it=ab.iterator();
      while(it.hasNext())
      {
      	System.out.println(it.next());
      }
	}

}
