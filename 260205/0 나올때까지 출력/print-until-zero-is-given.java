import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        while (true) {
            int i = sc.nextInt();
            if(i == 0) {
                break;
            }
            System.out.println(i);   
        }
    }
}