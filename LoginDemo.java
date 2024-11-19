package goi;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LoginDemo extends JFrame implements ActionListener {
public static void main(String[] args) {
	LoginDemo lg = new LoginDemo();
	lg.setVisible(true);
	lg.setSize(1000,1000);
	
}
JLabel luser = null;
JTextField tuser = null;
JLabel lpass = null;
JPasswordField tpass = null;
JButton login = null;
JTextArea jta;
public LoginDemo() {
	setLayout(null);
	luser = new JLabel("USER NAME");
	tuser = new JTextField();
	lpass = new JLabel("ENTER PASSWORD");
	tpass = new JPasswordField();
	login = new JButton("LOGIN");
	jta = new JTextArea();
	luser.setBounds(100,100,100,20);
	tuser.setBounds(250, 100, 100, 20);
	lpass.setBounds(100, 200, 150, 20);
	tpass.setBounds(250, 200, 100, 20);
	login.setBounds(150, 300, 100, 20);
	jta = new JTextArea(30,40);
	jta.setBackground(Color.blue);
	add(luser);
	add(tuser);
	add(lpass);
	add(tpass);
	add(login);
	add(jta);
	login.addActionListener(this);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}

	
}

