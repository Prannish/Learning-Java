import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        int n,c,rev=0,rem;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        c=n;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(c==rev){
            System.out.println("It is Palindrome");
        }
        else{
            System.out.println("It is Not Palindrome");
        }

    }
}