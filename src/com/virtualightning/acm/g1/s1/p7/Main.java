package com.virtualightning.acm.g1.s1.p7;


import java.util.Scanner;

/**
 * A+B for Input-Output Practice (VII)
 * http://acm.hdu.edu.cn/game/entry/problem/show.php?chapterid=1&sectionid=1&problemid=3007
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextInt()) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            System.out.println(num1 + num2);
            System.out.println();
        }
    }
}