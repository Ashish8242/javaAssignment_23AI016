package files;

import java.io.File;
import java.io.IOException;

public class DirDemo {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\ashis\\OneDrive\\documents\\personal document\\A\\");
        f1.mkdir();  
        System.out.println("Directory exists: " + f1.exists());

        File f2 = new File("C:\\Users\\ashis\\OneDrive\\documents\\personal document\\GSV.java");
        f2.createNewFile();  
        
        File f3 = new File("C:\\Users\\ashis\\OneDrive\\documents\\personal document\\GSV");
        System.out.println("Is file: " + f3.isFile());
        System.out.println("Is directory: " + f3.isDirectory());

        String[] all = f3.list();  

        int fcount = 0;
        int dcount = 0;
        int javaFiles =0;
        int jpeg = 0;
        int png = 0;
        int textFiles = 0;
        int csvFiles = 0;

        if (all != null) {  
            for (String name : all) {
                File f4 = new File("C:\\Users\\ashis\\OneDrive\\documents\\personal document\\GSV\\" + name);
                if (f4.isFile()) {
                    fcount++;
                    // Checking the file extension and counting accordingly
                    if (name.endsWith(".java")) {
                        javaFiles++;
                    } else if (name.endsWith(".png")) {
                        png++;
                    } else if (name.endsWith(".txt")) {
                        textFiles++;
                    } else if (name.endsWith(".csv")) {
                        csvFiles++;
                    } else if (name.endsWith(".jpg") || name.endsWith(".jpeg")) {
                        jpeg++;
                    }
                }
                if (f4.isDirectory()) {
                    dcount++;
                }
            }
        }

        System.out.println("Number of files: " + fcount);
        System.out.println("Number of directories: " + dcount);
        System.out.println("Java Files: " + javaFiles);
        System.out.println("PNG Files: " + png);
        System.out.println("Text Files: " + textFiles);
        System.out.println("Csv Files: " + csvFiles);
        System.out.println("JPG Files: " + jpeg);


        File[] fall = f3.listFiles(); 
    }
}
