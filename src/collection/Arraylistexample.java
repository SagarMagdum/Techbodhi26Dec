package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylistexample
{
public static void main(String[]arg)
{  List<String>ar= new ArrayList<String>();
        ar.add("sagar");
        ar.add("shubhdum");
        ar.add("yrs");
        ar.add(null);
	
        //Iterator<String>it=ar.iterator();
        //while(it.hasNext())
        //{
        //	System.out.println(it.next());
        //}
        
      for (String  str:ar)  
      {
    	  System.out.println(str); 
    	  
    	 
      }
        
        
      for (int i=0; i<ar.size(); i++)
      {
    	  System.out.println(ar.get(i)); 

      }
      
      
}
	
}
