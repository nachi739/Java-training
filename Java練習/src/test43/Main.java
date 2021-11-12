package test43;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double s = sc.nextDouble();
        double us = s - 18;
        double uk = s - 18.5;

        System.out.print(us + " " + uk);
    }
}
