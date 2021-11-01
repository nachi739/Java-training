package test29;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();//m個の値

		String[] c = new String[m];//比較配列ｃ

		for (int i = 0; i < m; i++) {//繰り返しcに格納
			c[i] = sc.next();
		}

		int n = sc.nextInt();//n個の値

		String[] s = new String[n];//比較配列ｓ

		for (int i = 0; i < n; i++) {//繰り返しｓに格納
			s[i] = sc.next();
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (s[j].contains(c[i])) {//比較結果を出力
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
	}
}
