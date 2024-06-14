import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int a=sc.nextInt();
        if(a>=18)
        {
            System.out.print("You are eligible to vote");
        }
        else if(a<=18)
        {
            System.out.print("You are  not eligible to vote");
        }
    }
}