import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; i++){
                arr[i][j] = sc.nextInt();
            }
        } 
          for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; i++){
                System.out.println((arr[i][j] * 3) + " ");
            }
        } 
    }
}