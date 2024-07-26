import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class A{
    public static void main(String[] args) {
        JFrame f1=new JFrame();
        f1.setSize(400,400);
        f1.setLayout(null);
        JLabel heading=new JLabel("Sum of 2 number");
        heading.setFont(new Font("Calibri",Font.BOLD,16));
        heading.setBounds(100,10,200,18);
        f1.add(heading);
        JLabel level1=new JLabel("Number 1");
        level1.setBounds(10,30,200,10);
        f1.add(level1);
        JTextField text1=new JTextField(10);
        text1.setBounds(100,30,200,15);
        f1.add(text1);
        JLabel level2=new JLabel("Number 2");
        level2.setBounds(10,50,200,10);
        f1.add(level2);
        JTextField text2=new JTextField(10);
        text2.setBounds(100,50,200,15);
        f1.add(text2);
        JLabel level3=new JLabel();
        level3.setBounds(10,100,200,10);
        f1.add(level3);
        JButton button=new JButton("Sum");
        button.setBounds(100,70,100,25);
        button.addActionListener(new ActionListener()
                             {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a,b,c;
                a= Integer.parseInt(text1.getText());
                b=Integer.parseInt(text2.getText());
                c=a+b;
                level3.setText("Sum of 2 number:"+c);
            }
        }
        );
        f1.add(button);
        f1.setVisible(true);
    }
}