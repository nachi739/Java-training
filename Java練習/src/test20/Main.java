package test20;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		char a = sc.next().charAt(0);
		String s = sc.next();
		String str = String.valueOf(a);

		if(s.contains(str)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
