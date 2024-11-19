package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileVideoReader {
 public static void main(String[] args) {
	 File f1 = null;
	 File f2 = null;
	 FileInputStream fis = null;
	 FileOutputStream fos = null;
	 try {
		 f1 = new File("C:\\Users\\ashis\\OneDrive\\Desktop\\IPL 2023 DATA ANALYSIS\\NATIONALITY OF EACH PLAYER IN DC.png");
		 fis = new FileInputStream(f1);
		 byte b[] = new byte[(int)f1.length()];
		 fis.read(b);
		 System.out.println(f1.length());
		 f2 = new File("C:\\Users\\ashis\\OneDrive\\Desktop\\IPL 2023 DATA ANALYSIS\\NATIONALITY OF EACH PLAYER IN DC111.png");
		 fos = new FileOutputStream(f2);
		 fos.write(b);
	 }
	 catch(IOException ex) {
		 ex.printStackTrace();
	 }
	 finally {
		 try {
			 if(fis!=null)
			 {fis.close();
			 fis = null;
			 }
		 }
		 catch(IOException ex){
			 ex.printStackTrace();
		 }
		 try {
			 if(fos!=null)
			 {fos.close();
			 fos = null;
			 }
		 }
		 catch(IOException ex){
			 ex.printStackTrace();
		 }
	 }
 }
}
