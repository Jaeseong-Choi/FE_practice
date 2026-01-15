import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        //문자열 공백을 기준으로 따로 받기
        String s1 = sc.next();
        String s2 = sc.next();
        
        if (s1.length() > s2.length()) {
            System.out.print(s1 + " " + s1.length()); 
        } else if (s1.length() < s2.length()) {
            System.out.print(s2 + " " + s2.length()); 
        } else {
            System.out.print("same"); 
        }
        
        
    }
}