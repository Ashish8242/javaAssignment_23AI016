package files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class fileReaderDemo {
    public static void main(String[] args) {
        File f1 = null;
        FileReader fr = null;
        try {
            // Correcting the file path string
            f1 = new File("C:\\Users\\ashis\\OneDrive\\documents\\personal document\\sample.txt");
            fr = new FileReader(f1);
            long len = f1.length();
            char[] ch = new char[(int) len];
            
            // Read the contents of the file into the char array
            int numRead = fr.read(ch);

            // Print the contents of the file
            for (int i = 0; i < numRead; i++) {
                System.out.print(ch[i]); // Using print to keep the output continuous
            }
            System.out.println(); // Just to add a newline after the loop
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close(); // Close the FileReader
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        // This loop prints ASCII characters and their corresponding values
        for (int i = 0; i < 256; i++) {
            System.out.println(i + " : " + (char) i);
        }
    }
}
