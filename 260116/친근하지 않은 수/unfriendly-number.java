import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        //값 입력
        int n = sc.nextInt();

        //저장할 변수 설정
        int count = 0;
        

        for(int i = 1; i <= n; i++){
            //친근한 수 2,3,5 필터링 
            if (i % 2 == 0) {
                continue;
            } else if (i % 3 == 0) {
                continue;
            } else if (i % 5 == 0){
                continue;
            } else {
                count += 1;
            }
        // 친근하지 않은 수의 개수 출력 
        }  System.out.println(count);
    }
}