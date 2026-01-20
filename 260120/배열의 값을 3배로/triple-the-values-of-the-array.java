import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        //입력 함수
        Scanner sc = new Scanner(System.in);

        //3*3 빈 배열 만들기 
        int[][] arr = new int[3][3];

        //각 배열에 값을 넣을 for문 
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++){
                arr[i][j] = sc.nextInt();
            }

        } 
        // 입력받은 값 출력하기 
          for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] * 3 + " ");
            }
            System.out.println();
        } 
    }
}