package test34;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 180 * (n - 2);
        
        System.out.println(s / n);
    }
}
