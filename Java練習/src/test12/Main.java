package test12;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int n = word.length();

        for(int i = 0; i < n+2; i++) {
        	System.out.print("+");
        }
        System.out.println("");
        System.out.println("+" + word +"+");

        for(int i = 0; i < n+2; i++) {
        	System.out.print("+");
        }
	}
}
