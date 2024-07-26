import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  -0 for Rock  -1 for Paper  -2 for Scissors");
        int user= sc.nextInt();

        Random random=new Random();
        int com= random.nextInt(3);

        if(user==com)
        {
            System.out.println("your choice:"+user+"\nComputer choice:"+com+"\n:Draw");
        }
        else if (user ==0 && com==2 || user ==1 && com==0 || user ==2 && com==1  )
        {
            System.out.println("your choice:"+user+"\nComputer choice:"+com+"\n:You Win");
        }
        else if (user ==2 && com==0 || user ==0 && com==1 || user ==1 && com==2  )
        {
            System.out.println("your choice:"+user+"\nComputer choice:"+com+"\n:Computer Wins");
        } else if (user>=3)
        {
            System.out.println("Choose From 0 to 2:Restart the game");
        }

    }
}