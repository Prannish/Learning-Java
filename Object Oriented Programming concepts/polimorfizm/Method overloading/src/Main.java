class Main{
    static void display(){
        System.out.println("Hello world");
    }
    static void display(int a){
        System.out.println("Hello world "+ a);
    }
    static void display(int a ,int b){
        System.out.println("Hello world " +(a+b));
    }

    public static void main(String[] args) {
        display();
        display(50);
        display(20,60);
    }
}



