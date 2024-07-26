import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Main m1=new Main();
        System.out.println("Enter your age:");
        Scanner sc= new Scanner(System.in);
        int a = sc .nextInt();
       try{ if (a<18)
        {
            throw new ArithmeticException("You are underage");
        }
       }
        catch(Exception e){
        System.out.println(" You cannot vote"+e.getMessage());
    }
       if(a>=18){
           System.out.println("You can vote");
       }
    }
}