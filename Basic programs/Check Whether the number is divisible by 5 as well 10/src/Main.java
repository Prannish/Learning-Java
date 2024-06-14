import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        if(a%5==0)
        {
            System.out.println("It is divisible by 5");
        }
        else
        {
            System.out.println("It is not divisible by 5");
        }
        if(a%10==0)
        {
            System.out.println("It is divisible by 10");
        }
        else
        {
            System.out.println("It is not divisible by 10");
        }
    }
}