package test38;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int total = 1;
		
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			if (m < total) {
				total += total -(m+1);
			} else {
				total += (m-1) ;	
			}
		}
		System.out.println(total);
	}
}
