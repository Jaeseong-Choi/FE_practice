import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int add = 0;
		
		for (int i = 1; add <= n; i++) {
			
			add += i;
			
			if (add >= n) {
				System.out.println(i);
			}
		}
	}

}
