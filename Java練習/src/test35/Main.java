package test35;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int f1 = sc.nextInt();
        int f2 = sc.nextInt();
        
        if (f1 >= f2) {
            System.out.println(f1 - f2);
        } else {
            System.out.println(f2 - f1);
        }
    }
}
