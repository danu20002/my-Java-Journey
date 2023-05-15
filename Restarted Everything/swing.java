import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class swing implements ActionListener {
    int count=0;
    JMenu menu;
    JMenuItem a1,a2;
    public swing(){
        JFrame frame=new JFrame("Example");
Scanner sc=new Scanner(System.in);
menu=new JMenu("options");
JMenuBar m1=new JMenuBar();
a1=new JMenuItem("example1");
a2=new JMenuItem("example2");
menu.add(a1);
menu.add(a2);
m1.add(menu);
frame.add(menu);
frame.setJMenuBar(m1);
frame.setSize(400,400);
frame.setLayout(null);
 frame.setVisible(true);
    }
public static void main(String[] args){
        swing my_swing=new swing();

}
public void actionPerformed(ActionEvent e){

}



}
