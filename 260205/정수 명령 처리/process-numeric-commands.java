import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        Stack<Integer> s = new Stack<Integer>();

        for (int i = 0; i < n; i++) {
            String value = sc.next();
            
            if(value.equals("push")){
                int num = sc.nextInt();
                s.push(num);
            } else if(value.equals("size")){
                System.out.println(s.size());
            } else if (value.equals("empty")) {
            	if (s.empty() == true) System.out.println("1");
            	else System.out.println("0");
            } else if (value.equals("pop")) {
            	System.out.println(s.pop());
            } else if (value.equals("top")) {
            	System.out.println(s.peek());
            }


        }


    }
}