package test23;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int h = Integer.parseInt(s.substring(0, 2));
		int m = Integer.parseInt(s.substring(3, 5));

		System.out.println(h);
		System.out.println(m);
	}
}
