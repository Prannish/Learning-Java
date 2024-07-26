abstract class bca
{
    public abstract void display();
}

class bba extends bca
{
    public void display()
    {
        System.out.println("Hii");
    }

public static void main(String[] args) {
    bba b1= new bba();
    b1.display();

}
}