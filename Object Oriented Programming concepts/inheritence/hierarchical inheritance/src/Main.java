class Parent{
    public void add(int a,int b) {
        System.out.println("sum=" + (a + b));
    }
}
class child1 extends Parent{
}
class child2 extends Parent{}
class BCA{
    public static void main(String[] args) {
        child1 c1=new child1();
        c1.add(2,3);
        child2 c2=new child2();
        c2.add(5,6);

    }
}