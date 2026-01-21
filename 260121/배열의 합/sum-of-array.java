import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        //빈 2차원 배열 생성
        int[][] arr = new int[4][4];

        //값을 저장할 변수 생성 
        int[] total = new int[4];




        //입력값 받기 
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

         for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                total[i] += arr[i][j];
            } System.out.println(total[i]);
        }
    }
}