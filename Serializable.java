package files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializable {
   public static void main(String[] args) {
	   PERSON p1 = new PERSON();
	   p1.name = "lolo";
	   p1.age = 45;
	   p1.weight = 100.5f;
	   p1.height = 5.6;
	   p1.pid = 111111;
	   p1.aadar = 32443;
	   File f1 = null;
	   FileOutputStream fos = null;
	   ObjectOutputStream oos = null;
	   try {
		   f1 = new File("C:\\Users\\ashis\\OneDrive\\documents\\personal document\\person.txt");
		   fos = new FileOutputStream(f1);
		   oos = new ObjectOutputStream(fos);
		   oos.writeObject(p1);
	   }
	   catch(IOException ex) {
		   ex.printStackTrace();
	   }
	   finally {
		   try {
			   if(oos!=null) {
				   oos.flush();
				   oos.close();
				   oos = null;
				   
			   }
		   }
		   catch(IOException ex){
			   ex.printStackTrace();
		   }
		    try {
			   if(fos!=null) {
				   fos.flush();
				   fos.close();
				   fos = null;
				   
			   }
		   }
		   catch(IOException ex){
			   ex.printStackTrace();
		   }
			   
		   }
	   }
			   
	   
	   
   }

