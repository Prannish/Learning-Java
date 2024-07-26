import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class BCA{
    public static void main(String[] args) {

        JFrame f1=new JFrame();
        f1.setLayout(null);
        f1.setSize(300,300);
        JPanel p1=new JPanel();
        p1.setBounds(30,30,30,150);
        p1.setBackground(Color.BLACK);
        f1.add(p1);
        JLabel l1=new JLabel("JPanel Example");
        l1.setForeground(Color.WHITE);
        l1.setBounds(35,35,100,15);
        p1.add(l1);
        f1.setVisible(true);


    }
}