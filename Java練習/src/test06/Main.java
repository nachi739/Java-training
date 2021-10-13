package test06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] strArray = sc.nextLine().split(",");

		System.out.println(strArray[0]);
		System.out.println(strArray[1]);
		System.out.println(strArray[2]);

		sc.close();
	}
}
