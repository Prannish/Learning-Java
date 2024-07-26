import java.io.*;
class Main{
    public static void main(String[] args) throws IOException
    {
        File f1 =new File("D:/pranish.txt");
        if (f1.createNewFile()==true)
        {
            System.out.println("File created successfully");
        }
        else
        {
                System.out.println("File already present");

        }
    }
}