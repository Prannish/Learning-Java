import javax.swing.*;
import java.awt.*;

class a{
    public static void main(String[] args) {
        JFrame frame =new JFrame("Menu box");

        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());
        JMenuBar bar =new JMenuBar();
        frame.setJMenuBar(bar);
        JMenu menu1 =new JMenu("File");
        bar.add(menu1);
        JMenu menu2 = new JMenu("Edit");
        bar.add(menu2);
        JMenu menu3=new JMenu("View");
        bar.add(menu3);
        JMenu menu4= new JMenu("Help");
        bar.add(menu4);
        JMenu imenu1= new JMenu("New");
        menu1.add(imenu1);
        JMenuItem imenu2= new JMenuItem("Save");
        menu1.add(imenu2);
        JMenuItem imenu3= new JMenuItem("Save as");
        menu1.add(imenu3);
        JMenuItem imenu4=new JMenuItem("Project");
        imenu1.add(imenu4);
        JMenuItem imenu5=new JMenuItem("File");
        imenu1.add(imenu5);
        JMenuItem imenu6=new JMenuItem("Redo");
        menu2.add(imenu6);
        JMenuItem imenu7=new JMenuItem("Undo");
        menu2.add(imenu7);
        JMenuItem imenu8=new JMenuItem("Cut");
        menu2.add(imenu8);
        JMenuItem imenu9=new JMenuItem("Paste");
        menu2.add(imenu9);
        JMenuItem imenu10=new JMenuItem("Status bar");
        menu3.add(imenu10);
        JMenu imenu11=new JMenu("Sort by");
        menu3.add(imenu11);
        JMenuItem imenu12=new JMenuItem("Learn more");
        menu4.add(imenu12);
        JMenuItem imenu13=new JMenuItem("List");
        imenu11.add(imenu13);
        JMenuItem imenu14=new JMenuItem("Details");
        imenu11.add(imenu14);
        frame.setVisible(true);
    }
}