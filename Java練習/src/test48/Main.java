package test48;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		HashMap<String, Integer> pa = new HashMap<>();

		for (int i = 0; i < n; i++) {
			String s = sc.next();

			pa.put(s, 0);
		}

		int m = sc.nextInt();

		for (int i = 0; i < m; i++) {
			String p = sc.next();
			int a = sc.nextInt();

			pa.put(p, pa.get(p) + a);
		}

		System.out.println(pa.get(sc.next()));
	}
}
