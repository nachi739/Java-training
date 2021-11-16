package test47;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();

		HashMap<String, Integer> sa = new HashMap<>();

		for (int i = 0; i < n; i++) {
			String s = sc.next();
			int a = sc.nextInt();

			sa.put(s, a);
		}

		System.out.println(sa.get(sc.next()));
	}
}
