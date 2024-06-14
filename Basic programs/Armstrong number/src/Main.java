import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num,arm=0,rem,temp;
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        temp=num;
        while(num>0)
        {
            rem=num%10;
            arm=arm+(rem*rem*rem);
            num=num/10;
        }
        if(temp==arm)
            System.out.println("It is armstrong  number ");
        else
            System.out.println("It is not armstrong number");
    }
}
