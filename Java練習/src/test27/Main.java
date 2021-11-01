package test27;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		boolean flag = false;
		//値を受け取る
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			//7が入力されてるかの有無
			if (a == 7) {
				flag = true;
			}
		}
		//出力
		if (flag) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
	}
}
