import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a, a2;
        a = sc.nextInt();
        a2 = sc.nextInt();

        int b, b2;
        b = sc.nextInt();
        b2 = sc.nextInt();

        if (a > b && a2 > b2) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}