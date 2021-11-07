package test37;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		for (int i = 1; i < n+1; i++) {
			if(i % x == 0 && i % y == 0) {
				System.out.println("AB");
			} else if (i % y == 0) {
				System.out.println("B");
			} else if(i % x == 0) {
				System.out.println("A");
			}else {
				System.out.println("N");
			}
		}
	}
}
