package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Checkedexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      FileInputStream fs=null;
      try {
    	  
		fs= new FileInputStream("C:\\Users\\SAM\\Desktop\\Java\\Hello.txt");
	} 
      catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
      int k;
      try
      {
    	 while ((k=fs.read())  !=-1)
    	 {
    		System.out.print((char)k) ;
    	 }
    	 fs.close();
      }
      catch(IOException ex)
      {
    	 System.out.println("i/o error occured"+ex) ;
      }
      
	}

}
