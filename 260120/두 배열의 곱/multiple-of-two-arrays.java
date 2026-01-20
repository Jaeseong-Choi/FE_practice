import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        //3*3 빈배열 2개 생성 
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];

        //arr1 값 입력 받기 
        for (int i = 0; i < arr1.length; i++ ){
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
    
        //arr2 값 입력 받기
        for (int i = 0; i < arr1.length; i++ ){
            for (int j = 0; j < arr1.length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        //곱을 출력 받을 새로운 배열 생성
        int[][] arr3 = new int[3][3];

        //같은 위치에 있는 수의 곱 입력 받기 
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                arr3[i][j] = arr1[i][j] * arr2[i][j] ;
            }
        }

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                System.out.print(arr3[i][j] + " ");
            } System.out.println();
        } 

    }
}