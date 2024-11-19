package goi;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class JComboBox extends JFrame implements ActionListener {
JComboBox comboTypesList = null;
JTextArea jta = null;
Container c = null;
public JComboBox()
{
	c= getContentPane();
	String[] comboTypes =  {"J2SE" , "J2EE" , "STRUTS" , "HIBERNATE" , "SPRING"};
	comboTypesList = new JCombo(comboTypes);
	comboTypesList.setSelectedIndex(2);
	jta = new JTextArea(10,20);
	c.setLayout(new FlowLayout());
	c.add(comboTypesList);
	c.add(jta);
	 
	comboTypesList.addActionListener(this);
	

}
public static void main(String[] args) {
	JComboBox jcb = new JComboBox();
	jcb.setVisible(true);
	jcb.setSize(300,300);
	;
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JComboBox jcmbType = (JComboBox) e.getSource();
	String cmbType = (String) jcmbType.getSelectedItem();
	if(cmbType.equals("J2SE")) {
		jta.setText(cmbType);
		jta.setBackground(Color.CYAN);
	}
	
}
}
