package demo;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;

public class demo {





    public static void main(String[] args) {
        JFrame frame = new JFrame("JDateChooser Test");
        JDateChooser dateChooser = new JDateChooser();
        frame.add(dateChooser);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
