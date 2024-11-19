package goi;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class JFrameDemo extends JFrame implements ActionListener {
public static void main(String[] args) {
	JFrameDemo jfd = new JFrameDemo();
	jfd.setTitle("My frame");
	jfd.setVisible(true);
	jfd.setSize(400,400);
	jfd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}
JButton addition,sub;
JTextArea jta,jtb,result;

public JFrameDemo() {
	setLayout(new FlowLayout());
	addition = new JButton("ADD");
	sub = new JButton("SUB");
	jta = new JTextArea("enter a number");
	jta.setSize(10,10);
	jtb = new JTextArea("ENTER B numbrr");
	result = new JTextArea("result");
	jtb.setSize(10,10);
	add(addition);
	
	add(sub);
	add(jta);
	add(jtb);
	add(result);
	addition.addActionListener(this);
	
	
	
}
@Override
public void actionPerformed(ActionEvent e) {
	if(addition.isEnabled()) {
		System.out.println("Addition");
		int a = Integer.parseInt(jta.getText());
		int b = Integer.parseInt(jtb.getText());
		int s = a+b;
		System.out.println(s);
		result.setText(s +"");
		
	}
}

}
