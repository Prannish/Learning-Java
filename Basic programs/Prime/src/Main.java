import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is prime or composite:");
        int a = sc.nextInt();
        int i;
        for (i = 2; i < a; i++) {
            if (a % i == 0) {
                break;
            }
        }
        if (a==i) {
            System.out.println("It is prime number");
        } else {
            System.out.println("It is composite number");
        }
    }
}
