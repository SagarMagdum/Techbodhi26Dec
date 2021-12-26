
package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Checkexception {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      FileInputStream fs=null;
      
    	  
		fs= new FileInputStream("C:\\Users\\SAM\\Desktop\\Java\\Hello.txt");
	
      
      int k;
      
      
    	 while ((k=fs.read())  !=-1)
    	 {
    		System.out.print((char)k) ;
    	 }
    	 fs.close();
      
   

      
	}


	
	
	
}
