package goi;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListDemo extends JFrame implements ListSelectionListener{
JList list;
String[] listColorNames = {"J2SE" , "J2EE" , "STRUTS" , "HIBERNATE" , "SPRING"};
Color[] listColorValues = {Color.cyan , Color.blue, Color.GREEN,Color.YELLOW , Color.WHITE};
Container contentpane;
JListDemo(){
	super("SDJ Different Color List");
	contentpane = getContentPane();
	contentpane.setLayout(new FlowLayout());
	list = new JList(listColorNames);
	list.setSelectedIndex(0);
	list.setSelectedIndex(ListSelectionModel.SINGLE_SELECTION);
	contentpane.add(new JScrollPane(list));
	list.addListSelectionListener(this);
}
public static void main(String[] args) {
	JListDemo jld = new JListDemo();
	jld.setSize(500,500);
	jld.setVisible(true);
	
}
@Override
public void valueChanged(ListSelectionEvent e) {
	// TODO Auto-generated method stub
	contentpane.setBackground(listColorValues[list.getSelectedIndex()]);
}
}
