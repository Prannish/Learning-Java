class myemployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
}
public class Main{
    public static void main(String[]args){
        myemployee e1=new myemployee();
        e1.setName("Code with Pranish");
        System.out.println(e1.getName());
        e1.setId(1011);
        System.out.println("My id is "+e1.getId());

    }
}