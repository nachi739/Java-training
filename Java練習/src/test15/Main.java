package test15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;

		for ( int i = 0; i < n; i++) {
			int m = sc.nextInt();

			if (m > max) {
				max = m;
			}
		}
		System.out.println(max);
	}
}
