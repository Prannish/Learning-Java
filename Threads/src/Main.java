class a extends Thread
{
    public void run()
    {
        for (int i = 1; i <= 500; i++)
        {
            System.out.println("Thread Program one");
        }
    }
}

class b extends Thread
{
    public void run()
        {
            for(int i=1;i<=500;i++)
            {
                System.out.println("Thread Program two");
            }
        }
    }

public class Main{
    public static void main(String[] args) {
        for(int i=1;i<=500;i++)
        {
            System.out.println("Main Program");
        }

        a obj1 = new a();
        b obj2 = new b();
        obj1.start();
        obj2.start();
    }
}