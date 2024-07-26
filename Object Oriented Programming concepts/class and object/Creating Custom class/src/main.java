class employee {
    int id;
    int salary;
    String name;

    public void printdetails() {
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
        System.out.println("and my salary is " + salary);
    }
}
public class main{
    public static void main(String[]args){
        System.out.println("Custom class program");
        employee n1=new employee();
        employee n2=new employee();
        n1.id=1011;
        n1.name="pranish";
        n1.salary=100000;
        n2.id=1012;
        n2.name="Utsab";
        n2.salary=80000;

        n1.printdetails();
        n2.printdetails();
    }
}