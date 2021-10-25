package test19;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			int val = String.valueOf(m).length();
			System.out.println(val);
		}
	}
}
