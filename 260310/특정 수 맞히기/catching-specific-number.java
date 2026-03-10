import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		
    	boolean match = true; 
    	
    	while(match) {
    		int num = sc.nextInt(); 
    		
    		if(num < 25) System.out.println("Higher");
    		else if (num > 25) System.out.println("lower");
    		else if ( num == 25) {
    			System.out.println("Good");
    			match = false;
    		}
    	}
        
    }
}