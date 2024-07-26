class Grand{
    public void show(){
        System.out.println("Grand Parent");
    }
}
class Parent extends Grand{
}
class Child extends Parent{
}
class BCA{
    public static void main(String[] args) {
        Child c1=new Child();
        c1.show();
    }
}