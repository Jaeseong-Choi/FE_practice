import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b) {
            if(a > c) {
                if (b > c){
                    System.out.println(b);            
                } else {
                    System.out.println(c);
                }
            }  else { 
                System.out.println(a);
            }
        } else if (a < b) {
            if (b > c) {
                if (a > c) {
                    System.out.println(a);
                } else {
                    System.out.println(c);
                }
            } else {
                System.out.println(b);
            }
        }
    }
}

