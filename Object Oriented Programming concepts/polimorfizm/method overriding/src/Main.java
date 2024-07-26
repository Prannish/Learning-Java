class bca
{
    public void display(){
        System.out.println("BCA");
    }
}
class bba extends bca{
    @Override
    public void display(){
        System.out.println("BBA");
    }
}
class bbs extends bca{
    @Override
    public void display(){
        System.out.println("BBS");
    }
}
class bsw extends bca{
    @Override
    public void display() {
        System.out.println("BSW");
    }
}
class Main
{
    public static void main(String[] args) {
        bca obj1=new bca();
        bca obj2=new bba();
        bca obj3=new bbs();
        bca obj4=new bsw();
        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();

    }
}