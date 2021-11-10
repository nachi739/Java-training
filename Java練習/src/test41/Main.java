package test41;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String[] ab = new String[n];

		for (int i = 0; i < n; i++) {
			String a = sc.next();
			String b = sc.next();

			if (a.length() == 1) {
				a = "0" + a;
			}

			if (b.length() == 1) {
				b = "0" + b;
			}

			ab[i] = a + b;
		}

		Arrays.sort(ab, Collections.reverseOrder());

		for (int i = 0; i < n; i++) {
			System.out.println(Integer.parseInt(ab[i].substring(0,2)) + " " + Integer.parseInt(ab[i].substring(2,4)));

		}
	}
}
