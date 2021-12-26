package collection;

import java.util.Map;
import java.util.TreeMap;

public class Trimappexample 

{
public static void main(String[]arg)

{
	TreeMap<Integer,String> map= new TreeMap<Integer,String>();
	   map.put(100,"Amit");
	   map.put(102,"Ravi");
	   
	   for (Map.Entry m:map.entrySet())
	   {
		   System.out.println(m.getKey()+" "+m.getValue());
	   }
}
	
}
