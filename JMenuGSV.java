import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JMenuGSV extends JFrame implements ActionListener, FocusListener {
   JMenuBar menu;
   JMenu file, edit, view, font;
   JMenuItem open, save, saveas, print, cut, copy, paste, tm, arial;
   JCheckBoxMenuItem password;
   JTextArea textarea;

   public static void main(String[] args) {
       JMenuGSV jmg = new JMenuGSV();
       jmg.setTitle("Note");
       jmg.setSize(500, 500);
       jmg.setVisible(true);
       
       jmg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close application properly
   }

   public JMenuGSV() {
       menu = new JMenuBar();
       file = new JMenu("FILE");
       edit = new JMenu("EDIT");
       view = new JMenu("VIEW");
       font = new JMenu("FONT");

       menu.add(file);
       menu.add(edit);
       menu.add(view);

       open = new JMenuItem("OPEN");
       save = new JMenuItem("SAVE");
       saveas = new JMenuItem("SAVE AS");
       print = new JMenuItem("PRINT");
       cut = new JMenuItem("CUT");
       copy = new JMenuItem("COPY");
       paste = new JMenuItem("PASTE");
       tm = new JMenuItem("TIMES NEW ROMAN");
       arial = new JMenuItem("Arial");

       password = new JCheckBoxMenuItem("Password");

       font.add(tm);
       font.add(arial);
       file.add(open);
       file.add(save);
       file.add(saveas);
       file.add(font);
       file.add(print);

       edit.add(cut);
       edit.add(copy);  // Added copy item
       edit.add(paste);
       edit.add(password);

       setJMenuBar(menu);  // Use setJMenuBar to add the menu
       textarea = new JTextArea();
       JScrollPane scrollPane = new JScrollPane(textarea);
       add(scrollPane, BorderLayout.CENTER);
       open.addActionListener(this);
       save.addActionListener(this);
   }

   @Override
  
   public void actionPerformed(ActionEvent e) {
       if (e.getSource() == open) {  // Handle the open action
           JFileChooser jfc = new JFileChooser();
           int openStatus = jfc.showOpenDialog(this);  
           if (openStatus == JFileChooser.APPROVE_OPTION) { 
               File f1 = jfc.getSelectedFile();
               System.out.println(f1.getAbsolutePath());
               OpenFrameDemo ofd = new OpenFrameDemo(f1);  
               ofd.setVisible(true);
               ofd.setSize(500, 500);
           }
       } else if (e.getSource() == save) {  // Handle the save action
           JFileChooser jfc = new JFileChooser();
           int savestatus = jfc.showSaveDialog(this);
           if (savestatus == JFileChooser.APPROVE_OPTION) {
               File f1 = jfc.getSelectedFile();
               try (FileWriter writer = new FileWriter(f1)) {
                   textarea.write(writer);  // Write the content of the text area to the file
               } catch (IOException ex) {
                   ex.printStackTrace();
               }
           }
       }
   } 
}

