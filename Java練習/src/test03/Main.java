package test03;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			System.out.println(s);
		}
		sc.close();
	}
}
