import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // Please write your code here.
        Stack<Character> s = new Stack<>();
        
        boolean match = true;
        
        for (int i =0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            if(c == '('){
            	s.push(c);
            }  else {
            	if (s.isEmpty()) {
            		match = false;
            		break;
            	}
            	s.pop();
            }
           
        }
        if (match && s.isEmpty()) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
        
    }
}