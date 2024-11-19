package file_handeling;

import java.io.File;
import java.io.IOException;

public class fileMethod {
  public static void main(String[] args) {
	  
	  try {
			  File f11 = new File("C:\\Users\\ashis\\OneDrive\\Desktop\\IPL 2023 DATA ANALYSIS.jpg");
			  boolean f11 = f11.exists();
			  System.out.println("Before status :" +status1);
			  f11.createNewFile();
			  		
			
		  }
	  catch(IOException ex) {
		  ex.printStackTrace();
	  }
	  
  }
}
