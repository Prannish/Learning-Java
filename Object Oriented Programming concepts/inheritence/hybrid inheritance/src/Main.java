class Parent{
    public void add(int a,int b) {
        System.out.println("sum=" + (a + b));
    }
}
class child1 extends Parent{
}
class child2 extends Parent{

}
class child3 extends child2{

}
class BCA{
    public static void main(String[] args) {
        child3 c1=new child3();
        c1.add(2,3);
    }
}
