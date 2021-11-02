package test30;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int s = sc.nextInt();

		d *= 100000;
		int ans = d / s;

		if (ans >= 10000) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
