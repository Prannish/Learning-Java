import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException{
        File f1 = new File("D:/pranish.txt");
        try{
            Scanner sc=new Scanner(f1);
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}