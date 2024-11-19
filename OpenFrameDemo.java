import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class OpenFrameDemo extends JFrame
{
public OpenFrameDemo(File f1) {
	JTextArea jta = new JTextArea();
	try {
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		String msg = null;
		while((msg = br.readLine()) != null) {
			System.out.println(msg);
			msg += msg;
			
		}
		System.out.println(msg);
		jta.setText(msg);
		add(jta);
	}
	catch(IOException e) {
		e.printStackTrace();
	}
}
}
