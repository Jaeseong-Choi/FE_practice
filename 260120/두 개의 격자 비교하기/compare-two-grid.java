import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        //행의 개수 받기
        int n = sc.nextInt();

        //열의 개수 받기 
        int m = sc.nextInt();

        //n * m 크기의 격자 생성 (2개)
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        //결과값 받을 격자 생성
        int[][] resultArr = new int[n][m];

        // arr1 값 입력 받기
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        // arr2 값 입력 받기
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        //결과값 받기
        for (int i = 0; i < resultArr.length; i++) {
            for (int j = 0; j < resultArr[i].length; j++) {
                if (arr1[i][j] == arr2[i][j]) {
                    resultArr[i][j] = 0;
                } else {
                   resultArr[i][j] = 1;
                }
            }
        }

        //결과값 출력
        for (int i = 0; i < resultArr.length; i++) {
            for (int j = 0; j < resultArr[i].length; j++) {
                System.out.print(resultArr[i][j] + " ");
            } System.out.println();
        }
    }
}