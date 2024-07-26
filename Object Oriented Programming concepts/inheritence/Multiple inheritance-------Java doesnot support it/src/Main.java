class Parent{
    public void add(int a,int b) {
        System.out.println("sum=" + (a + b));
    }
}
class child1 {
}
class child2 extends Parent,child1{//This program is not runable because java does'nt support multiple inheritance

}
class BCA {
    public static void main(String[] args) {
        child2 c1 = new child2();
    }
}