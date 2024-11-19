package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriterDemo {

    public static void main(String[] args) {
        File f1 = null;
        FileWriter fw = null;
        long length = 0;

        try {
            // Ensure you are specifying a file, not just a directory
            f1 = new File("C:\\Users\\ashis\\OneDrive\\documents\\personal document\\sample.txt");
            fw = new FileWriter(f1);

            fw.write("GSV AI JAVA Class");
            fw.flush(); // Flush the data to the file

            length = f1.length();
            System.out.println("Length after write: " + length);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close(); // Close the FileWriter
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
