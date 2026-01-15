import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] newArr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            newArr[i] = arr[i] * arr[i];
            System.out.print(newArr[i] + " ");
        }

    }
}