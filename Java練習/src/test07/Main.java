package test07;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		int n = Integer.parseInt(N);
		String[] str = sc.nextLine().split(",");

		for (int i = 0; i < n; i++) {
			System.out.println(str[i]);
		}
	}
}
