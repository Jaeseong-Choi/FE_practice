import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int add = 0;
		
		for (int i = a; i <= b; i++) {
			if (i % 2 == 1) {
				continue; 
			}
			add += i; 
		}
		
		System.out.println(add);
		
		

	}

}
