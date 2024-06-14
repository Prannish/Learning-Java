import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 number:");
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println("a.Sum\nb.Multiply\nc.Divide\nd.Subtract");
        System.out.println("Enter your choice");
        char c=input.next().charAt(0);
        switch(c){
            case 'a': case'A': {
                System.out.println("Sum="+(a+b));
                break;
            }
            case 'b':case'B':{
                System.out.println("Multiply="+(a*b));
                break;
            }
            case 'c':case'C': {
                System.out.println("Divide="+(a/b));
                break;
            }
            case 'd':case'D': {
                System.out.println("Subtract="+(a-b));
                break;
            }
            default:
            {
                System.out.println("Error!!");
                break;
            }
        }
    }
}