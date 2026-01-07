import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.println(a+b+c);
        System.out.println((a+b+c)/2);
        System.out.println((a+b+c)-((a+b+c)/2));
    }
}