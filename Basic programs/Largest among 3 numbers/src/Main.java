import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.printf(a+" "+"is greatest");
        }
        if(b>a && b>c)
        {
            System.out.printf(b+" "+"is greatest");
        }
        if(c>a && c>b)
        {
            System.out.printf(c+" "+"is greatest");
        }
    }
}