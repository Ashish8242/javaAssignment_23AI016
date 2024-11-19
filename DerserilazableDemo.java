package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class  DerserilazableDemo {
  public static void main(String[] args) {
	  File f1 = null;
	  FileInputStream fis = null;
	  ObjectInputStream ois = null;
	  try {
		  f1 = new File(("C:\\Users\\ashis\\OneDrive\\documents\\personal document\\person.txt");
		  fis = new FileInputStream(f1);
		  ois = new ObjectInputStream(fis);
		  PERSON p1 = (PERSON)ois.readObject();
		  System.out.println("NAME" + p1.name);
		  System.out.println("AGE" + p1.age);
		  System.out.println("weight" + p1.weight);
		  System.out.println("pid" + p1.pid);
		  System.out.println("aadahr" + p1.aadar);
		  System.out.println("height" + p1.height);
		  
	  }
	  catch(IOException ex){
		  ex.getMessage();
		  
		  
	  } catch(ClassNotFoundException ex) {
		  
		  ex.getMessage();
		  
	  }
  }
}
