class Parent{
    public void display() {
        System.out.println("SINGLE INHERITENCE"); }
}
class Child extends Parent{

}
class BCA{
    public static void main(String[] args) {
        Child c1=new Child();
        c1.display();
    }
}