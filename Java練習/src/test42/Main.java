package test42;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] k = {"6B","5B","4B","3B","2B","B","HB","F","H","2H","3H","4H","5H","6H","7H","8H","9H"};

        System.out.println(k[n-1]);
    }
}