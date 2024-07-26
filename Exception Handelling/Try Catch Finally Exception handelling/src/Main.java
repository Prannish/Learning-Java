import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try{
            System.out.println("Perform division");
            System.out.println("Enter number to be divided:");
            int num1=sc.nextInt();
            System.out.println("Enter number to be divided by:");
            int num2=sc.nextInt();
            int result=num1/num2;
            System.out.println("Answer:"+result);
        }
        catch(ArithmeticException e){
            System.out.println("Number cannot be divided by zero");
        }
        finally {
            System.out.println("Program Successfully run");
        }

    }

}
