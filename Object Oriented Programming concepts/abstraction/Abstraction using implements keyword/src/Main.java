interface prey{
    void food();
}
interface  predator{
    void hunter();
}

class fish implements prey,predator{
    public void hunter(){
        System.out.println("Shark");
    }
    public void food(){

        System.out.println("Fish");
    }
}


public class Main{
    public static void main(String[] args) {
        fish f1=new fish();
        f1.hunter();
        f1.food();
    }
}
